package typings.victoryBrushLine

import typings.react.mod.Component
import typings.react.mod.DOMAttributes
import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import typings.victoryBrushLine.anon.AllowDrag
import typings.victoryBrushLine.anon.AllowDraw
import typings.victoryBrushLine.anon.EventHandlers
import typings.victoryBrushLine.anon.Height
import typings.victoryBrushLine.anon.Key
import typings.victoryBrushLine.anon.Max
import typings.victoryBrushLine.anon.Pickanyscaleactivex1x2y1y
import typings.victoryBrushLine.anon.Style
import typings.victoryBrushLine.victoryBrushLineStrings.`ew-resize`
import typings.victoryBrushLine.victoryBrushLineStrings.`ns-resize`
import typings.victoryBrushLine.victoryBrushLineStrings.crosshair
import typings.victoryBrushLine.victoryBrushLineStrings.move
import typings.victoryBrushLine.victoryBrushLineStrings.x
import typings.victoryBrushLine.victoryBrushLineStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryBrushLineMod {
  
  @JSImport("victory-brush-line/lib/victory-brush-line", "VictoryBrushLine")
  @js.native
  open class VictoryBrushLine protected ()
    extends Component[VictoryBrushLineProps, js.Object, Any] {
    def this(props: VictoryBrushLineProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryBrushLineProps, context: Any) = this()
    
    def getCursor(props: Any): `ew-resize` | `ns-resize` | move | crosshair = js.native
    
    def getHandleDimensions(props: Any): Max = js.native
    
    def getRectDimensions(props: Any, brushWidth: Any): Height = js.native
    def getRectDimensions(props: Any, brushWidth: Any, domain: Any): Height = js.native
    
    def renderBrush(props: Any): (DetailedReactHTMLElement[Style, HTMLElement]) | Null = js.native
    
    def renderBrushArea(props: Any): DetailedReactHTMLElement[Style, HTMLElement] = js.native
    
    def renderHandles(props: Any): (js.Array[DetailedReactHTMLElement[Key, HTMLElement]]) | Null = js.native
    
    def renderLine(props: Any): DetailedReactHTMLElement[Pickanyscaleactivex1x2y1y, HTMLElement] = js.native
  }
  /* static members */
  object VictoryBrushLine {
    
    @JSImport("victory-brush-line/lib/victory-brush-line", "VictoryBrushLine")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultEvents(props: Any): js.UndefOr[js.Array[EventHandlers]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultEvents")(props.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[EventHandlers]]]
    
    @JSImport("victory-brush-line/lib/victory-brush-line", "VictoryBrushLine.defaultProps")
    @js.native
    def defaultProps: AllowDraw = js.native
    inline def defaultProps_=(x: AllowDraw): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-brush-line/lib/victory-brush-line", "VictoryBrushLine.propTypes")
    @js.native
    def propTypes: AllowDrag = js.native
    inline def propTypes_=(x: AllowDrag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait VictoryBrushLineProps extends StObject {
    
    var allowDrag: js.UndefOr[Boolean] = js.undefined
    
    var allowDraw: js.UndefOr[Boolean] = js.undefined
    
    var allowResize: js.UndefOr[Boolean] = js.undefined
    
    var brushAreaComponent: js.UndefOr[ReactElement] = js.undefined
    
    var brushAreaStyle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var brushAreaWidth: js.UndefOr[Double] = js.undefined
    
    var brushComponent: js.UndefOr[ReactElement] = js.undefined
    
    var brushDomain: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
      ] = js.undefined
    
    var brushStyle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var brushWidth: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dimension: js.UndefOr[x | y] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var events: js.UndefOr[DOMAttributes[Any]] = js.undefined
    
    var groupComponent: js.UndefOr[ReactElement] = js.undefined
    
    var handleComponent: js.UndefOr[ReactElement] = js.undefined
    
    var handleStyle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var handleWidth: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var lineComponent: js.UndefOr[ReactElement] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBrushDomainChange: js.UndefOr[
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ /* domain */ Any, 
          /* props */ js.UndefOr[this.type], 
          Unit
        ]
      ] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object VictoryBrushLineProps {
    
    inline def apply(): VictoryBrushLineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryBrushLineProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VictoryBrushLineProps] (val x: Self) extends AnyVal {
      
      inline def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
      
      inline def setAllowDragUndefined: Self = StObject.set(x, "allowDrag", js.undefined)
      
      inline def setAllowDraw(value: Boolean): Self = StObject.set(x, "allowDraw", value.asInstanceOf[js.Any])
      
      inline def setAllowDrawUndefined: Self = StObject.set(x, "allowDraw", js.undefined)
      
      inline def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
      
      inline def setAllowResizeUndefined: Self = StObject.set(x, "allowResize", js.undefined)
      
      inline def setBrushAreaComponent(value: ReactElement): Self = StObject.set(x, "brushAreaComponent", value.asInstanceOf[js.Any])
      
      inline def setBrushAreaComponentUndefined: Self = StObject.set(x, "brushAreaComponent", js.undefined)
      
      inline def setBrushAreaStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "brushAreaStyle", value.asInstanceOf[js.Any])
      
      inline def setBrushAreaStyleUndefined: Self = StObject.set(x, "brushAreaStyle", js.undefined)
      
      inline def setBrushAreaWidth(value: Double): Self = StObject.set(x, "brushAreaWidth", value.asInstanceOf[js.Any])
      
      inline def setBrushAreaWidthUndefined: Self = StObject.set(x, "brushAreaWidth", js.undefined)
      
      inline def setBrushComponent(value: ReactElement): Self = StObject.set(x, "brushComponent", value.asInstanceOf[js.Any])
      
      inline def setBrushComponentUndefined: Self = StObject.set(x, "brushComponent", js.undefined)
      
      inline def setBrushDomain(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
      ): Self = StObject.set(x, "brushDomain", value.asInstanceOf[js.Any])
      
      inline def setBrushDomainUndefined: Self = StObject.set(x, "brushDomain", js.undefined)
      
      inline def setBrushStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "brushStyle", value.asInstanceOf[js.Any])
      
      inline def setBrushStyleUndefined: Self = StObject.set(x, "brushStyle", js.undefined)
      
      inline def setBrushWidth(value: Double): Self = StObject.set(x, "brushWidth", value.asInstanceOf[js.Any])
      
      inline def setBrushWidthUndefined: Self = StObject.set(x, "brushWidth", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDimension(value: typings.victoryBrushLine.victoryBrushLineStrings.x | y): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setEvents(value: DOMAttributes[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setHandleComponent(value: ReactElement): Self = StObject.set(x, "handleComponent", value.asInstanceOf[js.Any])
      
      inline def setHandleComponentUndefined: Self = StObject.set(x, "handleComponent", js.undefined)
      
      inline def setHandleStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      inline def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      inline def setHandleWidth(value: Double): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
      
      inline def setHandleWidthUndefined: Self = StObject.set(x, "handleWidth", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLineComponent(value: ReactElement): Self = StObject.set(x, "lineComponent", value.asInstanceOf[js.Any])
      
      inline def setLineComponentUndefined: Self = StObject.set(x, "lineComponent", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBrushDomainChange(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ /* domain */ Any, /* props */ js.UndefOr[VictoryBrushLineProps]) => Unit
      ): Self = StObject.set(x, "onBrushDomainChange", js.Any.fromFunction2(value))
      
      inline def setOnBrushDomainChangeUndefined: Self = StObject.set(x, "onBrushDomainChange", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryBrushLine.victoryBrushLineStrings.data
    - typings.victoryBrushLine.victoryBrushLineStrings.labels
    - typings.victoryBrushLine.victoryBrushLineStrings.parent
  */
  trait VictoryBrushLineTargetType extends StObject
  object VictoryBrushLineTargetType {
    
    inline def data: typings.victoryBrushLine.victoryBrushLineStrings.data = "data".asInstanceOf[typings.victoryBrushLine.victoryBrushLineStrings.data]
    
    inline def labels: typings.victoryBrushLine.victoryBrushLineStrings.labels = "labels".asInstanceOf[typings.victoryBrushLine.victoryBrushLineStrings.labels]
    
    inline def parent: typings.victoryBrushLine.victoryBrushLineStrings.parent = "parent".asInstanceOf[typings.victoryBrushLine.victoryBrushLineStrings.parent]
  }
}
