package typings.typesettable

import typings.typesettable.abstractMeasurerMod.IDimensions
import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.characterMeasurerMod.CharacterMeasurer
import typings.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers/cacheCharacterMeasurer", JSImport.Namespace)
@js.native
object cacheCharacterMeasurerMod extends js.Object {
  @js.native
  class CacheCharacterMeasurer protected () extends CharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    var cache: js.Any = js.native
    def _measureCharacterNotFromCache(c: String): IDimensions = js.native
    def reset(): Unit = js.native
  }
  
}

