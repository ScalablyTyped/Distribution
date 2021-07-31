package typings.typesettable

import typings.typesettable.abstractMeasurerMod.IRuler
import typings.typesettable.contextsMod.IRulerFactoryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object measurersMod {
  
  @JSImport("typesettable/build/src/measurers", "AbstractMeasurer")
  @js.native
  class AbstractMeasurer protected ()
    extends typings.typesettable.abstractMeasurerMod.AbstractMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
  }
  /* static members */
  object AbstractMeasurer {
    
    @JSImport("typesettable/build/src/measurers", "AbstractMeasurer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A string representing the full ascender/descender range of your text.
      *
      * Note that this is really only applicable to western alphabets. If you are
      * using a different locale language such as arabic or chinese, you may want
      * to override this.
      */
    @JSImport("typesettable/build/src/measurers", "AbstractMeasurer.HEIGHT_TEXT")
    @js.native
    def HEIGHT_TEXT: String = js.native
    @scala.inline
    def HEIGHT_TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEIGHT_TEXT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typesettable/build/src/measurers", "CacheCharacterMeasurer")
  @js.native
  class CacheCharacterMeasurer protected ()
    extends typings.typesettable.cacheCharacterMeasurerMod.CacheCharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  }
  
  @JSImport("typesettable/build/src/measurers", "CacheMeasurer")
  @js.native
  class CacheMeasurer protected ()
    extends typings.typesettable.cacheMeasurerMod.CacheMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
  }
  
  @JSImport("typesettable/build/src/measurers", "CharacterMeasurer")
  @js.native
  class CharacterMeasurer protected ()
    extends typings.typesettable.characterMeasurerMod.CharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  }
  
  @JSImport("typesettable/build/src/measurers", "Measurer")
  @js.native
  class Measurer protected ()
    extends typings.typesettable.measurerMod.Measurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
  }
}
