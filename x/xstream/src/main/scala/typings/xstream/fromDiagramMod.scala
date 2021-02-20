package typings.xstream

import typings.xstream.mod.InternalProducer
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromDiagramMod {
  
  @JSImport("xstream/extra/fromDiagram", JSImport.Default)
  @js.native
  def default(diagram: String): Stream[_] = js.native
  @JSImport("xstream/extra/fromDiagram", JSImport.Default)
  @js.native
  def default(diagram: String, options: FromDiagramOptions): Stream[_] = js.native
  
  @JSImport("xstream/extra/fromDiagram", "DiagramProducer")
  @js.native
  class DiagramProducer protected ()
    extends InternalProducer[js.Any] {
    def this(diagram: String) = this()
    def this(diagram: String, opt: FromDiagramOptions) = this()
    
    var diagram: js.Any = js.native
    
    var errorVal: js.Any = js.native
    
    var schedule: js.Any = js.native
    
    var tasks: js.Any = js.native
    
    var timeUnit: js.Any = js.native
    
    var values: js.Any = js.native
  }
  
  @js.native
  trait FromDiagramOptions extends StObject {
    
    var errorValue: js.UndefOr[js.Any] = js.native
    
    var timeUnit: js.UndefOr[Double] = js.native
    
    var values: js.UndefOr[js.Object] = js.native
  }
  object FromDiagramOptions {
    
    @scala.inline
    def apply(): FromDiagramOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromDiagramOptions]
    }
    
    @scala.inline
    implicit class FromDiagramOptionsMutableBuilder[Self <: FromDiagramOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorValue(value: js.Any): Self = StObject.set(x, "errorValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorValueUndefined: Self = StObject.set(x, "errorValue", js.undefined)
      
      @scala.inline
      def setTimeUnit(value: Double): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
      
      @scala.inline
      def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
