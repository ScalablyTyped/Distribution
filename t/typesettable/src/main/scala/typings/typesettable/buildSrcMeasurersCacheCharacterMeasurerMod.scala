package typings.typesettable

import typings.typesettable.buildSrcContextsMod.IRulerFactoryContext
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IDimensions
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import typings.typesettable.buildSrcMeasurersCharacterMeasurerMod.CharacterMeasurer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcMeasurersCacheCharacterMeasurerMod {
  
  @JSImport("typesettable/build/src/measurers/cacheCharacterMeasurer", "CacheCharacterMeasurer")
  @js.native
  open class CacheCharacterMeasurer protected () extends CharacterMeasurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    
    def _measureCharacterNotFromCache(c: String): IDimensions = js.native
    
    /* private */ var cache: Any = js.native
    
    def reset(): Unit = js.native
  }
}
