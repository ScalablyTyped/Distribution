package typings.xstream

import typings.xstream.mod.InternalListener
import typings.xstream.mod.InternalProducer
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fromDiagramMod {
  
  @JSImport("xstream/extra/fromDiagram", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(diagram: String): Stream[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(diagram.asInstanceOf[js.Any]).asInstanceOf[Stream[Any]]
  inline def default(diagram: String, options: FromDiagramOptions): Stream[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(diagram.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Stream[Any]]
  
  @JSImport("xstream/extra/fromDiagram", "DiagramProducer")
  @js.native
  open class DiagramProducer protected ()
    extends StObject
       with InternalProducer[Any] {
    def this(diagram: String) = this()
    def this(diagram: String, opt: FromDiagramOptions) = this()
    
    /* CompleteClass */
    override def _start(listener: InternalListener[Any]): Unit = js.native
    
    /* CompleteClass */
    override def _stop(): Unit = js.native
    
    /* private */ var diagram: Any = js.native
    
    /* private */ var errorVal: Any = js.native
    
    /* private */ var schedule: Any = js.native
    
    /* private */ var tasks: Any = js.native
    
    /* private */ var timeUnit: Any = js.native
    
    /* private */ var values: Any = js.native
  }
  
  trait FromDiagramOptions extends StObject {
    
    var errorValue: js.UndefOr[Any] = js.undefined
    
    var timeUnit: js.UndefOr[Double] = js.undefined
    
    var values: js.UndefOr[js.Object] = js.undefined
  }
  object FromDiagramOptions {
    
    inline def apply(): FromDiagramOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromDiagramOptions]
    }
    
    extension [Self <: FromDiagramOptions](x: Self) {
      
      inline def setErrorValue(value: Any): Self = StObject.set(x, "errorValue", value.asInstanceOf[js.Any])
      
      inline def setErrorValueUndefined: Self = StObject.set(x, "errorValue", js.undefined)
      
      inline def setTimeUnit(value: Double): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
      
      inline def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
      
      inline def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
