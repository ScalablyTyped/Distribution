package typings.typesettable

import typings.typesettable.contextsMod.IRulerFactoryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractMeasurerMod {
  
  @JSImport("typesettable/build/src/measurers/abstractMeasurer", "AbstractMeasurer")
  @js.native
  class AbstractMeasurer protected () extends StObject {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    
    def measure(): IDimensions = js.native
    def measure(text: String): IDimensions = js.native
    
    var ruler: js.Any = js.native
  }
  /* static members */
  object AbstractMeasurer {
    
    @JSImport("typesettable/build/src/measurers/abstractMeasurer", "AbstractMeasurer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A string representing the full ascender/descender range of your text.
      *
      * Note that this is really only applicable to western alphabets. If you are
      * using a different locale language such as arabic or chinese, you may want
      * to override this.
      */
    @JSImport("typesettable/build/src/measurers/abstractMeasurer", "AbstractMeasurer.HEIGHT_TEXT")
    @js.native
    def HEIGHT_TEXT: String = js.native
    @scala.inline
    def HEIGHT_TEXT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEIGHT_TEXT")(x.asInstanceOf[js.Any])
  }
  
  trait IDimensions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object IDimensions {
    
    @scala.inline
    def apply(height: Double, width: Double): IDimensions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDimensions]
    }
    
    @scala.inline
    implicit class IDimensionsMutableBuilder[Self <: IDimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  type IRuler = js.Function1[/* text */ String, IDimensions]
  
  type IRulerFactory = js.Function0[IRuler]
}
