package typings.victoryTooltip

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.victoryTooltip.anon.X
import typings.victoryTooltip.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("victory-tooltip/src", "Flyout")
  @js.native
  open class Flyout protected () extends Component[FlyoutProps, Any, Any] {
    def this(props: FlyoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FlyoutProps, context: Any) = this()
  }
  
  @JSImport("victory-tooltip/src", "VictoryTooltip")
  @js.native
  open class VictoryTooltip protected () extends Component[VictoryTooltipProps, Any, Any] {
    def this(props: VictoryTooltipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryTooltipProps, context: Any) = this()
  }
  /* static members */
  object VictoryTooltip {
    
    @JSImport("victory-tooltip/src", "VictoryTooltip")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-tooltip/src", "VictoryTooltip.defaultEvents")
    @js.native
    def defaultEvents: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, StringOrNumberOrCallback> */ Any
      ] = js.native
    inline def defaultEvents_=(
      x: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<string, StringOrNumberOrCallback> */ Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultEvents")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any */ trait FlyoutProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var center: js.UndefOr[X] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var cornerRadius: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    var datum: js.UndefOr[js.Object] = js.undefined
    
    var dx: js.UndefOr[Double] = js.undefined
    
    var dy: js.UndefOr[Double] = js.undefined
    
    var events: js.UndefOr[js.Object] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var orientation: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ] = js.undefined
    
    var pathComponent: js.UndefOr[ReactElement] = js.undefined
    
    var pointerLength: js.UndefOr[Double] = js.undefined
    
    var pointerWidth: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var shapeRendering: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var transform: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object FlyoutProps {
    
    inline def apply(): FlyoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlyoutProps]
    }
    
    extension [Self <: FlyoutProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setCenter(value: X): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setEvents(value: js.Object): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOrientation(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPathComponent(value: ReactElement): Self = StObject.set(x, "pathComponent", value.asInstanceOf[js.Any])
      
      inline def setPathComponentUndefined: Self = StObject.set(x, "pathComponent", js.undefined)
      
      inline def setPointerLength(value: Double): Self = StObject.set(x, "pointerLength", value.asInstanceOf[js.Any])
      
      inline def setPointerLengthUndefined: Self = StObject.set(x, "pointerLength", js.undefined)
      
      inline def setPointerWidth(value: Double): Self = StObject.set(x, "pointerWidth", value.asInstanceOf[js.Any])
      
      inline def setPointerWidthUndefined: Self = StObject.set(x, "pointerWidth", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setShapeRendering(value: String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
      
      inline def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelableProps * / any */ trait VictoryTooltipProps extends StObject {
    
    var activateData: js.UndefOr[Boolean] = js.undefined
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var activePoints: js.UndefOr[js.Array[Any]] = js.undefined
    
    var angle: js.UndefOr[String | Double] = js.undefined
    
    var center: js.UndefOr[X] = js.undefined
    
    var centerOffset: js.UndefOr[Y] = js.undefined
    
    var constrainToVisibleArea: js.UndefOr[Boolean] = js.undefined
    
    var cornerRadius: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    var datum: js.UndefOr[js.Object] = js.undefined
    
    var dx: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var dy: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var events: js.UndefOr[StringDictionary[js.Function1[/* event */ SyntheticEvent[Any, Event], Unit]]] = js.undefined
    
    var flyoutComponent: js.UndefOr[ReactElement] = js.undefined
    
    var flyoutHeight: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var flyoutPadding: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PaddingOrCallback */ Any
      ] = js.undefined
    
    var flyoutStyle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var flyoutWidth: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var groupComponent: js.UndefOr[ReactElement] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double | String] = js.undefined
    
    var orientation: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any) | (js.Function1[
          /* repeated */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
        ])
      ] = js.undefined
    
    var pointerLength: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var pointerOrientation: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any) | (js.Function1[
          /* repeated */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
        ])
      ] = js.undefined
    
    var pointerWidth: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var renderInPortal: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
        ])
      ] = js.undefined
    
    var text: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | (js.Array[Double | String])
      ] = js.undefined
    
    var theme: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryThemeDefinition */ Any
      ] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object VictoryTooltipProps {
    
    inline def apply(): VictoryTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryTooltipProps]
    }
    
    extension [Self <: VictoryTooltipProps](x: Self) {
      
      inline def setActivateData(value: Boolean): Self = StObject.set(x, "activateData", value.asInstanceOf[js.Any])
      
      inline def setActivateDataUndefined: Self = StObject.set(x, "activateData", js.undefined)
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActivePoints(value: js.Array[Any]): Self = StObject.set(x, "activePoints", value.asInstanceOf[js.Any])
      
      inline def setActivePointsUndefined: Self = StObject.set(x, "activePoints", js.undefined)
      
      inline def setActivePointsVarargs(value: Any*): Self = StObject.set(x, "activePoints", js.Array(value*))
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAngle(value: String | Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setCenter(value: X): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterOffset(value: Y): Self = StObject.set(x, "centerOffset", value.asInstanceOf[js.Any])
      
      inline def setCenterOffsetUndefined: Self = StObject.set(x, "centerOffset", js.undefined)
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setConstrainToVisibleArea(value: Boolean): Self = StObject.set(x, "constrainToVisibleArea", value.asInstanceOf[js.Any])
      
      inline def setConstrainToVisibleAreaUndefined: Self = StObject.set(x, "constrainToVisibleArea", js.undefined)
      
      inline def setCornerRadius(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDatum(value: js.Object): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setDx(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setEvents(value: StringDictionary[js.Function1[/* event */ SyntheticEvent[Any, Event], Unit]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setFlyoutComponent(value: ReactElement): Self = StObject.set(x, "flyoutComponent", value.asInstanceOf[js.Any])
      
      inline def setFlyoutComponentUndefined: Self = StObject.set(x, "flyoutComponent", js.undefined)
      
      inline def setFlyoutHeight(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "flyoutHeight", value.asInstanceOf[js.Any])
      
      inline def setFlyoutHeightUndefined: Self = StObject.set(x, "flyoutHeight", js.undefined)
      
      inline def setFlyoutPadding(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PaddingOrCallback */ Any
      ): Self = StObject.set(x, "flyoutPadding", value.asInstanceOf[js.Any])
      
      inline def setFlyoutPaddingUndefined: Self = StObject.set(x, "flyoutPadding", js.undefined)
      
      inline def setFlyoutStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "flyoutStyle", value.asInstanceOf[js.Any])
      
      inline def setFlyoutStyleUndefined: Self = StObject.set(x, "flyoutStyle", js.undefined)
      
      inline def setFlyoutWidth(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "flyoutWidth", value.asInstanceOf[js.Any])
      
      inline def setFlyoutWidthUndefined: Self = StObject.set(x, "flyoutWidth", js.undefined)
      
      inline def setGroupComponent(value: ReactElement): Self = StObject.set(x, "groupComponent", value.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setIndex(value: Double | String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOrientation(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any) | (js.Function1[
              /* repeated */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
            ])
      ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationFunction1(
        value: /* repeated */ Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "orientation", js.Any.fromFunction1(value))
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setPointerLength(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "pointerLength", value.asInstanceOf[js.Any])
      
      inline def setPointerLengthUndefined: Self = StObject.set(x, "pointerLength", js.undefined)
      
      inline def setPointerOrientation(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any) | (js.Function1[
              /* repeated */ Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
            ])
      ): Self = StObject.set(x, "pointerOrientation", value.asInstanceOf[js.Any])
      
      inline def setPointerOrientationFunction1(
        value: /* repeated */ Any => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "pointerOrientation", js.Any.fromFunction1(value))
      
      inline def setPointerOrientationUndefined: Self = StObject.set(x, "pointerOrientation", js.undefined)
      
      inline def setPointerWidth(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "pointerWidth", value.asInstanceOf[js.Any])
      
      inline def setPointerWidthUndefined: Self = StObject.set(x, "pointerWidth", js.undefined)
      
      inline def setRenderInPortal(value: Boolean): Self = StObject.set(x, "renderInPortal", value.asInstanceOf[js.Any])
      
      inline def setRenderInPortalUndefined: Self = StObject.set(x, "renderInPortal", js.undefined)
      
      inline def setStyle(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any) | (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any
            ])
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyleVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelStyleObject */ Any)*
      ): Self = StObject.set(x, "style", js.Array(value*))
      
      inline def setText(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | (js.Array[Double | String])
      ): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: (Double | String)*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryThemeDefinition */ Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
