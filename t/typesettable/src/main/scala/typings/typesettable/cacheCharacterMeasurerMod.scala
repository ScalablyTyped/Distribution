package typings.typesettable

import typings.typesettable.abstractMeasurerMod.IDimensions
import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.characterMeasurerMod.CharacterMeasurer
import typings.typesettable.contextsMod.IRulerFactoryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheCharacterMeasurerMod {
  
  @JSImport("typesettable/build/src/measurers/cacheCharacterMeasurer", "CacheCharacterMeasurer")
  @js.native
  class CacheCharacterMeasurer protected () extends CharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    
    def _measureCharacterNotFromCache(c: String): IDimensions = js.native
    
    var cache: js.Any = js.native
    
    def reset(): Unit = js.native
  }
}
