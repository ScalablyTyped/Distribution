package typings.typesettable

import typings.typesettable.abstractMeasurerMod.IDimensions
import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.cacheCharacterMeasurerMod.CacheCharacterMeasurer
import typings.typesettable.contextsMod.IRulerFactoryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMeasurerMod {
  
  @JSImport("typesettable/build/src/measurers/cacheMeasurer", "CacheMeasurer")
  @js.native
  class CacheMeasurer protected () extends CacheCharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    
    def _measureNotFromCache(s: String): IDimensions = js.native
    
    /* private */ var dimCache: js.Any = js.native
  }
}
