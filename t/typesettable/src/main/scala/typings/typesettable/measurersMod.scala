package typings.typesettable

import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers", JSImport.Namespace)
@js.native
object measurersMod extends js.Object {
  @js.native
  class AbstractMeasurer protected ()
    extends typings.typesettable.abstractMeasurerMod.AbstractMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
  }
  
  @js.native
  class CacheCharacterMeasurer protected ()
    extends typings.typesettable.cacheCharacterMeasurerMod.CacheCharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  }
  
  @js.native
  class CacheMeasurer protected ()
    extends typings.typesettable.cacheMeasurerMod.CacheMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
  }
  
  @js.native
  class CharacterMeasurer ()
    extends typings.typesettable.characterMeasurerMod.CharacterMeasurer
  
  @js.native
  class Measurer protected ()
    extends typings.typesettable.measurerMod.Measurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  }
  
  /* static members */
  @js.native
  object AbstractMeasurer extends js.Object {
    /**
      * A string representing the full ascender/descender range of your text.
      *
      * Note that this is really only applicable to western alphabets. If you are
      * using a different locale language such as arabic or chinese, you may want
      * to override this.
      */
    var HEIGHT_TEXT: String = js.native
  }
  
}

