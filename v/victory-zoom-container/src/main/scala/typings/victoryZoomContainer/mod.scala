package typings.victoryZoomContainer

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.victoryZoomContainer.anon.X
import typings.victoryZoomContainer.anon.XY
import typings.victoryZoomContainer.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("victory-zoom-container/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object RawZoomHelpers {
    
    @JSImport("victory-zoom-container/lib", "RawZoomHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkDomainEquality(a: Any, b: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDomainEquality")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getDomain(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getDomainScale(domain: Any, scale: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainScale")(domain.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getLastDomain(targetProps: Any, originalDomain: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastDomain")(targetProps.asInstanceOf[js.Any], originalDomain.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getMinimumDomain(point: Any, props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMinimumDomain")(point.asInstanceOf[js.Any], props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getPosition(evt: Any, props: Any, originalDomain: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(evt.asInstanceOf[js.Any], props.asInstanceOf[js.Any], originalDomain.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getScaleFactor(evt: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getScaleFactor")(evt.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getScalePercent(evt: Any, props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getScalePercent")(evt.asInstanceOf[js.Any], props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getScaledDomain(currentDomain: Any, factor: Any, percent: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getScaledDomain")(currentDomain.asInstanceOf[js.Any], factor.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def handleAnimation(ctx: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("handleAnimation")(ctx.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def onMouseDown(evt: Any, targetProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("onMouseDown")(evt.asInstanceOf[js.Any], targetProps.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def onMouseLeave(evt: Any, targetProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("onMouseLeave")(evt.asInstanceOf[js.Any], targetProps.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def onMouseMove(evt: Any, targetProps: Any, eventKey: Any, ctx: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("onMouseMove")(evt.asInstanceOf[js.Any], targetProps.asInstanceOf[js.Any], eventKey.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def onMouseUp(evt: Any, targetProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("onMouseUp")(evt.asInstanceOf[js.Any], targetProps.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def onWheel(evt: Any, targetProps: Any, eventKey: Any, ctx: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("onWheel")(evt.asInstanceOf[js.Any], targetProps.asInstanceOf[js.Any], eventKey.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def pan(currentDomain: Any, originalDomain: Any, delta: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("pan")(currentDomain.asInstanceOf[js.Any], originalDomain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def scale(currentDomain: Any, evt: Any, props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(currentDomain.asInstanceOf[js.Any], evt.asInstanceOf[js.Any], props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def zoommingOut(evt: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("zoommingOut")(evt.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  @JSImport("victory-zoom-container/lib", "VictoryZoomContainer")
  @js.native
  open class VictoryZoomContainer protected () extends Component[VictoryZoomContainerProps, Any, Any] {
    def this(props: VictoryZoomContainerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryZoomContainerProps, context: Any) = this()
  }
  
  /* Inlined std.Pick<{checkDomainEquality (a : any, b : any): any, scale (currentDomain : any, evt : any, props : any, axis : any): any, getScaledDomain (currentDomain : any, factor : any, percent : any): any, getMinimumDomain (point : any, props : any, axis : any): any, zoommingOut (evt : any): any, getScaleFactor (evt : any): any, getScalePercent (evt : any, props : any, axis : any): any, getPosition (evt : any, props : any, originalDomain : any): any, pan (currentDomain : any, originalDomain : any, delta : any): any, getDomainScale (domain : any, scale : any, axis : any): any, handleAnimation (ctx : any): any, getLastDomain (targetProps : any, originalDomain : any): any, getDomain (props : any): any, onMouseDown (evt : any, targetProps : any): any, onMouseUp (evt : any, targetProps : any): any, onMouseLeave (evt : any, targetProps : any): any, onMouseMove (evt : any, targetProps : any, eventKey : any, ctx : any): any, onWheel (evt : any, targetProps : any, eventKey : any, ctx : any): any}, 'checkDomainEquality' | 'onMouseDown' | 'onMouseUp' | 'onMouseLeave' | 'onMouseMove' | 'onWheel'> */
  object ZoomHelpers {
    
    @JSImport("victory-zoom-container/lib", "ZoomHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-zoom-container/lib", "ZoomHelpers.checkDomainEquality")
    @js.native
    def checkDomainEquality: js.Function2[/* a */ Any, /* b */ Any, Any] = js.native
    inline def checkDomainEquality_=(x: js.Function2[/* a */ Any, /* b */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkDomainEquality")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-zoom-container/lib", "ZoomHelpers.onMouseDown")
    @js.native
    def onMouseDown: js.Function2[/* evt */ Any, /* targetProps */ Any, Any] = js.native
    inline def onMouseDown_=(x: js.Function2[/* evt */ Any, /* targetProps */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-zoom-container/lib", "ZoomHelpers.onMouseLeave")
    @js.native
    def onMouseLeave: js.Function2[/* evt */ Any, /* targetProps */ Any, Any] = js.native
    inline def onMouseLeave_=(x: js.Function2[/* evt */ Any, /* targetProps */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-zoom-container/lib", "ZoomHelpers.onMouseMove")
    @js.native
    def onMouseMove: js.Function4[/* evt */ Any, /* targetProps */ Any, /* eventKey */ Any, /* ctx */ Any, Any] = js.native
    inline def onMouseMove_=(x: js.Function4[/* evt */ Any, /* targetProps */ Any, /* eventKey */ Any, /* ctx */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-zoom-container/lib", "ZoomHelpers.onMouseUp")
    @js.native
    def onMouseUp: js.Function2[/* evt */ Any, /* targetProps */ Any, Any] = js.native
    inline def onMouseUp_=(x: js.Function2[/* evt */ Any, /* targetProps */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-zoom-container/lib", "ZoomHelpers.onWheel")
    @js.native
    def onWheel: js.Function4[/* evt */ Any, /* targetProps */ Any, /* eventKey */ Any, /* ctx */ Any, Any] = js.native
    inline def onWheel_=(x: js.Function4[/* evt */ Any, /* targetProps */ Any, /* eventKey */ Any, /* ctx */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(x.asInstanceOf[js.Any])
  }
  
  inline def zoomContainerMixin(base: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("zoomContainerMixin")(base.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryContainerProps * / any */ trait VictoryZoomContainerProps extends StObject {
    
    var allowPan: js.UndefOr[Boolean] = js.undefined
    
    var allowZoom: js.UndefOr[Boolean] = js.undefined
    
    var clipContainerComponent: js.UndefOr[ReactElement] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var downsample: js.UndefOr[Double | Boolean] = js.undefined
    
    var minimumZoom: js.UndefOr[X] = js.undefined
    
    var onZoomDomainChange: js.UndefOr[js.Function2[/* domain */ Y, /* props */ this.type, Unit]] = js.undefined
    
    var zoomDimension: js.UndefOr[ZoomDimensionType] = js.undefined
    
    var zoomDomain: js.UndefOr[XY] = js.undefined
  }
  object VictoryZoomContainerProps {
    
    inline def apply(): VictoryZoomContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryZoomContainerProps]
    }
    
    extension [Self <: VictoryZoomContainerProps](x: Self) {
      
      inline def setAllowPan(value: Boolean): Self = StObject.set(x, "allowPan", value.asInstanceOf[js.Any])
      
      inline def setAllowPanUndefined: Self = StObject.set(x, "allowPan", js.undefined)
      
      inline def setAllowZoom(value: Boolean): Self = StObject.set(x, "allowZoom", value.asInstanceOf[js.Any])
      
      inline def setAllowZoomUndefined: Self = StObject.set(x, "allowZoom", js.undefined)
      
      inline def setClipContainerComponent(value: ReactElement): Self = StObject.set(x, "clipContainerComponent", value.asInstanceOf[js.Any])
      
      inline def setClipContainerComponentUndefined: Self = StObject.set(x, "clipContainerComponent", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDownsample(value: Double | Boolean): Self = StObject.set(x, "downsample", value.asInstanceOf[js.Any])
      
      inline def setDownsampleUndefined: Self = StObject.set(x, "downsample", js.undefined)
      
      inline def setMinimumZoom(value: X): Self = StObject.set(x, "minimumZoom", value.asInstanceOf[js.Any])
      
      inline def setMinimumZoomUndefined: Self = StObject.set(x, "minimumZoom", js.undefined)
      
      inline def setOnZoomDomainChange(value: (/* domain */ Y, VictoryZoomContainerProps) => Unit): Self = StObject.set(x, "onZoomDomainChange", js.Any.fromFunction2(value))
      
      inline def setOnZoomDomainChangeUndefined: Self = StObject.set(x, "onZoomDomainChange", js.undefined)
      
      inline def setZoomDimension(value: ZoomDimensionType): Self = StObject.set(x, "zoomDimension", value.asInstanceOf[js.Any])
      
      inline def setZoomDimensionUndefined: Self = StObject.set(x, "zoomDimension", js.undefined)
      
      inline def setZoomDomain(value: XY): Self = StObject.set(x, "zoomDomain", value.asInstanceOf[js.Any])
      
      inline def setZoomDomainUndefined: Self = StObject.set(x, "zoomDomain", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryZoomContainer.victoryZoomContainerStrings.x
    - typings.victoryZoomContainer.victoryZoomContainerStrings.y
  */
  trait ZoomDimensionType extends StObject
  object ZoomDimensionType {
    
    inline def x: typings.victoryZoomContainer.victoryZoomContainerStrings.x = "x".asInstanceOf[typings.victoryZoomContainer.victoryZoomContainerStrings.x]
    
    inline def y: typings.victoryZoomContainer.victoryZoomContainerStrings.y = "y".asInstanceOf[typings.victoryZoomContainer.victoryZoomContainerStrings.y]
  }
}
