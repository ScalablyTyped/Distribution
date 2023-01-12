package typings.victoryCore

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.victoryCore.anon.Height
import typings.victoryCore.libVictoryPortalPortalContextMod.PortalContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryPortalPortalMod {
  
  @JSImport("victory-core/lib/victory-portal/portal", "Portal")
  @js.native
  open class Portal protected ()
    extends Component[PortalProps, js.Object, Any]
       with PortalContextValue {
    def this(props: PortalProps) = this()
    
    /* private */ var getChildren: Any = js.native
    
    /* private */ var index: Any = js.native
    
    /* private */ val map: Any = js.native
    
    /* CompleteClass */
    override def portalDeregister(key: Double): Unit = js.native
    
    /* CompleteClass */
    override def portalRegister(): Double = js.native
    
    /* CompleteClass */
    override def portalUpdate(key: Double, element: ReactElement): Unit = js.native
  }
  /* static members */
  object Portal {
    
    @JSImport("victory-core/lib/victory-portal/portal", "Portal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-portal/portal", "Portal.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-portal/portal", "Portal.propTypes")
    @js.native
    def propTypes: Height = js.native
    inline def propTypes_=(x: Height): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait PortalProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortalProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
