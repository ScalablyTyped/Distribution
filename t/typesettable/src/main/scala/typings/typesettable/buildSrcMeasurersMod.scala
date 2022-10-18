package typings.typesettable

import typings.typesettable.buildSrcContextsMod.IRulerFactoryContext
import typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcMeasurersMod {
  
  @JSImport("typesettable/build/src/measurers", "AbstractMeasurer")
  @js.native
  open class AbstractMeasurer protected ()
    extends typings.typesettable.buildSrcMeasurersAbstractMeasurerMod.AbstractMeasurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
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
    inline def HEIGHT_TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEIGHT_TEXT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typesettable/build/src/measurers", "CacheCharacterMeasurer")
  @js.native
  open class CacheCharacterMeasurer protected ()
    extends typings.typesettable.buildSrcMeasurersCacheCharacterMeasurerMod.CacheCharacterMeasurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
  }
  
  @JSImport("typesettable/build/src/measurers", "CacheMeasurer")
  @js.native
  open class CacheMeasurer protected ()
    extends typings.typesettable.buildSrcMeasurersCacheMeasurerMod.CacheMeasurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
  }
  
  @JSImport("typesettable/build/src/measurers", "CharacterMeasurer")
  @js.native
  open class CharacterMeasurer protected ()
    extends typings.typesettable.buildSrcMeasurersCharacterMeasurerMod.CharacterMeasurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
  }
  
  @JSImport("typesettable/build/src/measurers", "Measurer")
  @js.native
  open class Measurer protected ()
    extends typings.typesettable.buildSrcMeasurersMeasurerMod.Measurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
  }
}
