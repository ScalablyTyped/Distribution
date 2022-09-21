package typings.victoryBar

import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.victoryBar.anon.Bottom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("victory-bar/src", "Bar")
  @js.native
  open class Bar protected () extends Component[BarProps, Any, Any] {
    def this(props: BarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BarProps, context: Any) = this()
  }
  
  @JSImport("victory-bar/src", "VictoryBar")
  @js.native
  open class VictoryBar protected () extends Component[VictoryBarProps, Any, Any] {
    def this(props: VictoryBarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryBarProps, context: Any) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonPrimitiveProps * / any */ trait BarProps extends StObject {
    
    var alignment: js.UndefOr[VictoryBarAlignmentType] = js.undefined
    
    var barOffset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var barRatio: js.UndefOr[Double] = js.undefined
    
    var barWidth: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var cornerRadius: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any) | Bottom
      ] = js.undefined
    
    var datum: js.UndefOr[Any] = js.undefined
    
    var getPath: js.UndefOr[js.Function] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var pathComponent: js.UndefOr[ReactElement] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var y0: js.UndefOr[Double] = js.undefined
  }
  object BarProps {
    
    inline def apply(): BarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BarProps]
    }
    
    extension [Self <: BarProps](x: Self) {
      
      inline def setAlignment(value: VictoryBarAlignmentType): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBarOffset(value: js.Array[Double]): Self = StObject.set(x, "barOffset", value.asInstanceOf[js.Any])
      
      inline def setBarOffsetUndefined: Self = StObject.set(x, "barOffset", js.undefined)
      
      inline def setBarOffsetVarargs(value: Double*): Self = StObject.set(x, "barOffset", js.Array(value*))
      
      inline def setBarRatio(value: Double): Self = StObject.set(x, "barRatio", value.asInstanceOf[js.Any])
      
      inline def setBarRatioUndefined: Self = StObject.set(x, "barRatio", js.undefined)
      
      inline def setBarWidth(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
      
      inline def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
      
      inline def setCornerRadius(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any) | Bottom
      ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setDatum(value: Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setGetPath(value: js.Function): Self = StObject.set(x, "getPath", value.asInstanceOf[js.Any])
      
      inline def setGetPathUndefined: Self = StObject.set(x, "getPath", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setPathComponent(value: ReactElement): Self = StObject.set(x, "pathComponent", value.asInstanceOf[js.Any])
      
      inline def setPathComponentUndefined: Self = StObject.set(x, "pathComponent", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryBar.victoryBarStrings.start
    - typings.victoryBar.victoryBarStrings.middle
    - typings.victoryBar.victoryBarStrings.end
  */
  trait VictoryBarAlignmentType extends StObject
  object VictoryBarAlignmentType {
    
    inline def end: typings.victoryBar.victoryBarStrings.end = "end".asInstanceOf[typings.victoryBar.victoryBarStrings.end]
    
    inline def middle: typings.victoryBar.victoryBarStrings.middle = "middle".asInstanceOf[typings.victoryBar.victoryBarStrings.middle]
    
    inline def start: typings.victoryBar.victoryBarStrings.start = "start".asInstanceOf[typings.victoryBar.victoryBarStrings.start]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryDatableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryMultiLabelableProps * / any */ trait VictoryBarProps extends StObject {
    
    var alignment: js.UndefOr[VictoryBarAlignmentType] = js.undefined
    
    var barRatio: js.UndefOr[Double] = js.undefined
    
    var barWidth: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var cornerRadius: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any) | Bottom
      ] = js.undefined
    
    var eventKey: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryBarTTargetType, number | string | Array<number> | Array<string>> */ Any
        ]
      ] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ] = js.undefined
  }
  object VictoryBarProps {
    
    inline def apply(): VictoryBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryBarProps]
    }
    
    extension [Self <: VictoryBarProps](x: Self) {
      
      inline def setAlignment(value: VictoryBarAlignmentType): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBarRatio(value: Double): Self = StObject.set(x, "barRatio", value.asInstanceOf[js.Any])
      
      inline def setBarRatioUndefined: Self = StObject.set(x, "barRatio", js.undefined)
      
      inline def setBarWidth(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "barWidth", value.asInstanceOf[js.Any])
      
      inline def setBarWidthUndefined: Self = StObject.set(x, "barWidth", js.undefined)
      
      inline def setCornerRadius(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any) | Bottom
      ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setEventKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryBarTTargetType, number | string | Array<number> | Array<string>> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryBarTTargetType, number | string | Array<number> | Array<string>> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.victoryBar.victoryBarStrings.data
    - typings.victoryBar.victoryBarStrings.labels
    - typings.victoryBar.victoryBarStrings.parent
  */
  trait VictoryBarTTargetType extends StObject
  object VictoryBarTTargetType {
    
    inline def data: typings.victoryBar.victoryBarStrings.data = "data".asInstanceOf[typings.victoryBar.victoryBarStrings.data]
    
    inline def labels: typings.victoryBar.victoryBarStrings.labels = "labels".asInstanceOf[typings.victoryBar.victoryBarStrings.labels]
    
    inline def parent: typings.victoryBar.victoryBarStrings.parent = "parent".asInstanceOf[typings.victoryBar.victoryBarStrings.parent]
  }
}
