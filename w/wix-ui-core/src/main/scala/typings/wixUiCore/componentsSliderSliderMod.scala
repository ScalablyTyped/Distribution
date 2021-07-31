package typings.wixUiCore

import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.wixUiCore.anon.Dictx
import typings.wixUiCore.anon.Dragging
import typings.wixUiCore.anon.Height
import typings.wixUiCore.anon.Left
import typings.wixUiCore.anon.OffsetHeight
import typings.wixUiCore.anon.OffsetLeft
import typings.wixUiCore.anon.OffsetTop
import typings.wixUiCore.anon.PartialSliderPropsArialabel
import typings.wixUiCore.wixUiCoreStrings.across
import typings.wixUiCore.wixUiCoreStrings.always
import typings.wixUiCore.wixUiCoreStrings.bar
import typings.wixUiCore.wixUiCoreStrings.circle
import typings.wixUiCore.wixUiCoreStrings.count
import typings.wixUiCore.wixUiCoreStrings.dot
import typings.wixUiCore.wixUiCoreStrings.horizontal
import typings.wixUiCore.wixUiCoreStrings.hover
import typings.wixUiCore.wixUiCoreStrings.left
import typings.wixUiCore.wixUiCoreStrings.line
import typings.wixUiCore.wixUiCoreStrings.middle
import typings.wixUiCore.wixUiCoreStrings.none
import typings.wixUiCore.wixUiCoreStrings.normal
import typings.wixUiCore.wixUiCoreStrings.rectangle
import typings.wixUiCore.wixUiCoreStrings.right
import typings.wixUiCore.wixUiCoreStrings.square
import typings.wixUiCore.wixUiCoreStrings.value
import typings.wixUiCore.wixUiCoreStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSliderSliderMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/slider/Slider", "Slider")
  @js.native
  class Slider protected ()
    extends PureComponent[SliderProps, SliderState, js.Any] {
    def this(props: SliderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SliderProps, context: js.Any) = this()
    
    def blur(): Unit = js.native
    
    def calcDiscreteStepValue(min: js.Any, max: js.Any, step: js.Any, stepType: js.Any): js.Any = js.native
    
    def calcThumbCrossPosition(): String = js.native
    
    def calcThumbPosition(): Left | Dictx = js.native
    
    def calcThumbProgressPosition(): String = js.native
    
    def calcTrackFillPosition(): String = js.native
    
    def clamp(`val`: js.Any, min: js.Any, max: js.Any): Double = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSlider(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSlider(): Unit = js.native
    
    def floorValue(value: js.Any): Double = js.native
    def floorValue(value: js.Any, precision: Double): Double = js.native
    
    def focus(): Unit = js.native
    
    def getInnerDims(): js.Any = js.native
    
    def getInnerOffsets(): OffsetHeight | OffsetLeft | OffsetTop = js.native
    
    def getSliderLength(): Double = js.native
    
    def getSliderSize(): Double = js.native
    
    def getStartPos(): left | right = js.native
    
    def getStepValue(): js.Any = js.native
    
    def getThumbSize(): Height = js.native
    
    def getThumbSizeCrossAxis(): Double = js.native
    
    def getThumbSizeMainAxis(): Double = js.native
    
    def handleBlur(): Unit = js.native
    
    def handleChange(value: js.Any): Unit = js.native
    
    def handleKeyDown(ev: js.Any): Unit = js.native
    
    def handleMouseDown(): Unit = js.native
    
    def handleMouseMove(ev: js.Any): Unit = js.native
    
    def handleMouseUp(): Unit = js.native
    
    def handleThumbEnter(): Unit = js.native
    
    def handleThumbLeave(): Unit = js.native
    
    def isContinuous(): Boolean = js.native
    
    def isRtl(): Boolean = js.native
    
    def isShallowEqual(v: js.Any, o: js.Any): Boolean = js.native
    
    def isVertical(): Boolean = js.native
    
    def moveThumbByMouse(ev: js.Any): Unit = js.native
    
    def renderTooltip(): Element = js.native
    
    var root: HTMLDivElement = js.native
    
    def setTrackNode(track: js.Any): Unit = js.native
    
    def shouldShowTooltip(): Boolean = js.native
    
    @JSName("state")
    var state_Slider: Dragging = js.native
    
    def ticksShown(): Boolean = js.native
    
    var track: HTMLDivElement = js.native
  }
  /* static members */
  object Slider {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/slider/Slider", "Slider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/slider/Slider", "Slider.defaultProps")
    @js.native
    def defaultProps: PartialSliderPropsArialabel = js.native
    @scala.inline
    def defaultProps_=(x: PartialSliderPropsArialabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/slider/Slider", "Slider.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait SliderProps extends StObject {
    
    var `aria-label`: String
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* x */ js.Any, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var stepType: js.UndefOr[value | count] = js.undefined
    
    var style: js.UndefOr[Style] = js.undefined
    
    var thumbShape: js.UndefOr[circle | square | rectangle | bar] = js.undefined
    
    var tickMarksPosition: js.UndefOr[normal | middle | across] = js.undefined
    
    var tickMarksShape: js.UndefOr[none | line | dot] = js.undefined
    
    var tooltipPosition: js.UndefOr[normal | across] = js.undefined
    
    var tooltipPrefix: js.UndefOr[String] = js.undefined
    
    var tooltipSuffix: js.UndefOr[String] = js.undefined
    
    var tooltipVisibility: js.UndefOr[none | always | hover] = js.undefined
    
    var trackSize: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object SliderProps {
    
    @scala.inline
    def apply(`aria-label`: String): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderProps]
    }
    
    @scala.inline
    implicit class SliderPropsMutableBuilder[Self <: SliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* x */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepType(value: value | count): Self = StObject.set(x, "stepType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepTypeUndefined: Self = StObject.set(x, "stepType", js.undefined)
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setThumbShape(value: circle | square | rectangle | bar): Self = StObject.set(x, "thumbShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbShapeUndefined: Self = StObject.set(x, "thumbShape", js.undefined)
      
      @scala.inline
      def setTickMarksPosition(value: normal | middle | across): Self = StObject.set(x, "tickMarksPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickMarksPositionUndefined: Self = StObject.set(x, "tickMarksPosition", js.undefined)
      
      @scala.inline
      def setTickMarksShape(value: none | line | dot): Self = StObject.set(x, "tickMarksShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickMarksShapeUndefined: Self = StObject.set(x, "tickMarksShape", js.undefined)
      
      @scala.inline
      def setTooltipPosition(value: normal | across): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
      
      @scala.inline
      def setTooltipPrefix(value: String): Self = StObject.set(x, "tooltipPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPrefixUndefined: Self = StObject.set(x, "tooltipPrefix", js.undefined)
      
      @scala.inline
      def setTooltipSuffix(value: String): Self = StObject.set(x, "tooltipSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipSuffixUndefined: Self = StObject.set(x, "tooltipSuffix", js.undefined)
      
      @scala.inline
      def setTooltipVisibility(value: none | always | hover): Self = StObject.set(x, "tooltipVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipVisibilityUndefined: Self = StObject.set(x, "tooltipVisibility", js.undefined)
      
      @scala.inline
      def setTrackSize(value: Double): Self = StObject.set(x, "trackSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackSizeUndefined: Self = StObject.set(x, "trackSize", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SliderState extends StObject {
    
    var dragging: Boolean
    
    var inKeyPress: Boolean
    
    var mouseDown: Boolean
    
    var thumbHover: Boolean
  }
  object SliderState {
    
    @scala.inline
    def apply(dragging: Boolean, inKeyPress: Boolean, mouseDown: Boolean, thumbHover: Boolean): SliderState = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], inKeyPress = inKeyPress.asInstanceOf[js.Any], mouseDown = mouseDown.asInstanceOf[js.Any], thumbHover = thumbHover.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderState]
    }
    
    @scala.inline
    implicit class SliderStateMutableBuilder[Self <: SliderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInKeyPress(value: Boolean): Self = StObject.set(x, "inKeyPress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseDown(value: Boolean): Self = StObject.set(x, "mouseDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbHover(value: Boolean): Self = StObject.set(x, "thumbHover", value.asInstanceOf[js.Any])
    }
  }
  
  trait Style extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
