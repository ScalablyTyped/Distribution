package typings.victoryCore

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import typings.victoryCore.anon.Fill
import typings.victoryCore.anon.PartialVictoryLabelProps
import typings.victoryCore.anon.WeakValidationMapVictoryL
import typings.victoryCore.libTypesCallbacksMod.CallbackArgs
import typings.victoryCore.libTypesCallbacksMod.NumberOrCallback
import typings.victoryCore.libTypesCallbacksMod.StringOrCallback
import typings.victoryCore.libTypesCallbacksMod.StringOrNumberOrCallback
import typings.victoryCore.libTypesPropTypesMod.ValueOrAccessor
import typings.victoryCore.libVictoryThemeTypesMod.PaddingProps
import typings.victoryCore.libVictoryThemeTypesMod.VerticalAnchorType
import typings.victoryCore.libVictoryThemeTypesMod.VictoryLabelStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryLabelVictoryLabelMod {
  
  /* Inlined {  role :string,   defaultStyles :{  fill :string,   fontSize :number,   fontFamily :string,   stroke :string}} & react.react.FC<victory-core.victory-core/lib/victory-label/victory-label.VictoryLabelProps> */
  object VictoryLabel {
    
    inline def apply(props: VictoryLabelProps): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    inline def apply(props: VictoryLabelProps, context: Any): ReactElement | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
    
    @JSImport("victory-core/lib/victory-label/victory-label", "VictoryLabel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-label/victory-label", "VictoryLabel.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-label/victory-label", "VictoryLabel.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialVictoryLabelProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialVictoryLabelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-label/victory-label", "VictoryLabel.defaultStyles")
    @js.native
    def defaultStyles: Fill = js.native
    inline def defaultStyles_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultStyles")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-label/victory-label", "VictoryLabel.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-label/victory-label", "VictoryLabel.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapVictoryL] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapVictoryL]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-label/victory-label", "VictoryLabel.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryCore.victoryCoreStrings.parallel
    - typings.victoryCore.victoryCoreStrings.perpendicular
    - typings.victoryCore.victoryCoreStrings.vertical
  */
  trait LabelOrientationType extends StObject
  object LabelOrientationType {
    
    inline def parallel: typings.victoryCore.victoryCoreStrings.parallel = "parallel".asInstanceOf[typings.victoryCore.victoryCoreStrings.parallel]
    
    inline def perpendicular: typings.victoryCore.victoryCoreStrings.perpendicular = "perpendicular".asInstanceOf[typings.victoryCore.victoryCoreStrings.perpendicular]
    
    inline def vertical: typings.victoryCore.victoryCoreStrings.vertical = "vertical".asInstanceOf[typings.victoryCore.victoryCoreStrings.vertical]
  }
  
  trait OriginType extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object OriginType {
    
    inline def apply(x: Double, y: Double): OriginType = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginType]
    }
    
    extension [Self <: OriginType](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryCore.victoryCoreStrings.start
    - typings.victoryCore.victoryCoreStrings.middle
    - typings.victoryCore.victoryCoreStrings.end
    - typings.victoryCore.victoryCoreStrings.inherit
  */
  trait TextAnchorType extends StObject
  object TextAnchorType {
    
    inline def end: typings.victoryCore.victoryCoreStrings.end = "end".asInstanceOf[typings.victoryCore.victoryCoreStrings.end]
    
    inline def inherit: typings.victoryCore.victoryCoreStrings.inherit = "inherit".asInstanceOf[typings.victoryCore.victoryCoreStrings.inherit]
    
    inline def middle: typings.victoryCore.victoryCoreStrings.middle = "middle".asInstanceOf[typings.victoryCore.victoryCoreStrings.middle]
    
    inline def start: typings.victoryCore.victoryCoreStrings.start = "start".asInstanceOf[typings.victoryCore.victoryCoreStrings.start]
  }
  
  trait VictoryLabelProps extends StObject {
    
    var angle: js.UndefOr[StringOrNumberOrCallback] = js.undefined
    
    var ariaLabel: js.UndefOr[StringOrCallback] = js.undefined
    
    var backgroundComponent: js.UndefOr[ReactElement] = js.undefined
    
    var backgroundPadding: js.UndefOr[PaddingProps | js.Array[PaddingProps]] = js.undefined
    
    var backgroundStyle: js.UndefOr[VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]] = js.undefined
    
    var capHeight: js.UndefOr[StringOrNumberOrCallback] = js.undefined
    
    var children: js.UndefOr[StringOrNumberOrCallback] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    var datum: js.UndefOr[js.Object] = js.undefined
    
    var desc: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
    
    var dx: js.UndefOr[StringOrNumberOrCallback] = js.undefined
    
    var dy: js.UndefOr[StringOrNumberOrCallback] = js.undefined
    
    var events: js.UndefOr[DOMAttributes[Any]] = js.undefined
    
    var groupComponent: js.UndefOr[ReactElement] = js.undefined
    
    var id: js.UndefOr[StringOrNumberOrCallback] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var labelPlacement: js.UndefOr[LabelOrientationType] = js.undefined
    
    var lineHeight: js.UndefOr[StringOrNumberOrCallback | (js.Array[String | Double])] = js.undefined
    
    var origin: js.UndefOr[OriginType] = js.undefined
    
    var polar: js.UndefOr[Boolean] = js.undefined
    
    var renderInPortal: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]] = js.undefined
    
    var tabIndex: js.UndefOr[NumberOrCallback] = js.undefined
    
    var text: js.UndefOr[js.Array[String] | StringOrNumberOrCallback] = js.undefined
    
    var textAnchor: js.UndefOr[ValueOrAccessor[TextAnchorType, CallbackArgs]] = js.undefined
    
    var textComponent: js.UndefOr[ReactElement] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[ValueOrAccessor[String | js.Object, CallbackArgs]] = js.undefined
    
    var tspanComponent: js.UndefOr[ReactElement] = js.undefined
    
    var verticalAnchor: js.UndefOr[ValueOrAccessor[VerticalAnchorType, CallbackArgs]] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object VictoryLabelProps {
    
    inline def apply(): VictoryLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryLabelProps]
    }
    
    extension [Self <: VictoryLabelProps](x: Self) {
      
      inline def setAngle(value: StringOrNumberOrCallback): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "angle", js.Any.fromFunction1(value))
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setAriaLabel(value: StringOrCallback): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelFunction1(value: /* args */ CallbackArgs => String): Self = StObject.set(x, "ariaLabel", js.Any.fromFunction1(value))
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setBackgroundComponent(value: ReactElement): Self = StObject.set(x, "backgroundComponent", value.asInstanceOf[js.Any])
      
      inline def setBackgroundComponentUndefined: Self = StObject.set(x, "backgroundComponent", js.undefined)
      
      inline def setBackgroundPadding(value: PaddingProps | js.Array[PaddingProps]): Self = StObject.set(x, "backgroundPadding", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPaddingUndefined: Self = StObject.set(x, "backgroundPadding", js.undefined)
      
      inline def setBackgroundPaddingVarargs(value: PaddingProps*): Self = StObject.set(x, "backgroundPadding", js.Array(value*))
      
      inline def setBackgroundStyle(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): Self = StObject.set(x, "backgroundStyle", value.asInstanceOf[js.Any])
      
      inline def setBackgroundStyleUndefined: Self = StObject.set(x, "backgroundStyle", js.undefined)
      
      inline def setBackgroundStyleVarargs(value: VictoryLabelStyleObject*): Self = StObject.set(x, "backgroundStyle", js.Array(value*))
      
      inline def setCapHeight(value: StringOrNumberOrCallback): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
      
      inline def setCapHeightFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "capHeight", js.Any.fromFunction1(value))
      
      inline def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
      
      inline def setChildren(value: StringOrNumberOrCallback): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisableInlineStyles(value: Boolean): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
      
      inline def setDisableInlineStylesUndefined: Self = StObject.set(x, "disableInlineStyles", js.undefined)
      
      inline def setDx(value: StringOrNumberOrCallback): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "dx", js.Any.fromFunction1(value))
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: StringOrNumberOrCallback): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "dy", js.Any.fromFunction1(value))
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setEvents(value: DOMAttributes[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setId(value: StringOrNumberOrCallback): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setLabelPlacement(value: LabelOrientationType): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setLineHeight(value: StringOrNumberOrCallback | (js.Array[String | Double])): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "lineHeight", js.Any.fromFunction1(value))
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setLineHeightVarargs(value: (String | Double)*): Self = StObject.set(x, "lineHeight", js.Array(value*))
      
      inline def setOrigin(value: OriginType): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPolar(value: Boolean): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
      
      inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
      
      inline def setRenderInPortal(value: Boolean): Self = StObject.set(x, "renderInPortal", value.asInstanceOf[js.Any])
      
      inline def setRenderInPortalUndefined: Self = StObject.set(x, "renderInPortal", js.undefined)
      
      inline def setStyle(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(value: VictoryLabelStyleObject*): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setTabIndex(value: NumberOrCallback): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexFunction1(value: /* args */ CallbackArgs => Double): Self = StObject.set(x, "tabIndex", js.Any.fromFunction1(value))
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setText(value: js.Array[String] | StringOrNumberOrCallback): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAnchor(value: ValueOrAccessor[TextAnchorType, CallbackArgs]): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
      
      inline def setTextAnchorFunction1(value: CallbackArgs => TextAnchorType): Self = StObject.set(x, "textAnchor", js.Any.fromFunction1(value))
      
      inline def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
      
      inline def setTextComponent(value: ReactElement): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
      
      inline def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
      
      inline def setTextFunction1(value: /* args */ CallbackArgs => String | Double): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTransform(value: ValueOrAccessor[String | js.Object, CallbackArgs]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformFunction1(value: CallbackArgs => String | js.Object): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setTspanComponent(value: ReactElement): Self = StObject.set(x, "tspanComponent", value.asInstanceOf[js.Any])
      
      inline def setTspanComponentUndefined: Self = StObject.set(x, "tspanComponent", js.undefined)
      
      inline def setVerticalAnchor(value: ValueOrAccessor[VerticalAnchorType, CallbackArgs]): Self = StObject.set(x, "verticalAnchor", value.asInstanceOf[js.Any])
      
      inline def setVerticalAnchorFunction1(value: CallbackArgs => VerticalAnchorType): Self = StObject.set(x, "verticalAnchor", js.Any.fromFunction1(value))
      
      inline def setVerticalAnchorUndefined: Self = StObject.set(x, "verticalAnchor", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
