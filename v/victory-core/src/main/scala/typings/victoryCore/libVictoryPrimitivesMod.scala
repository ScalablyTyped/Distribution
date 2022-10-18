package typings.victoryCore

import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.victoryCore.anon.Active
import typings.victoryCore.anon.AriaLabel_
import typings.victoryCore.anon.Children
import typings.victoryCore.anon.CircleComponent
import typings.victoryCore.anon.ClassName
import typings.victoryCore.anon.ClipPath
import typings.victoryCore.anon.Data
import typings.victoryCore.anon.Desc
import typings.victoryCore.anon.DisableInlineStyles
import typings.victoryCore.anon.LineComponent
import typings.victoryCore.anon.PathComponent
import typings.victoryCore.anon.RectComponent
import typings.victoryCore.anon.Role
import typings.victoryCore.libVictoryPrimitivesArcMod.ArcProps
import typings.victoryCore.libVictoryPrimitivesBackgroundMod.BackgroundProps
import typings.victoryCore.libVictoryPrimitivesBorderMod.BorderProps
import typings.victoryCore.libVictoryPrimitivesClipPathMod.ClipPathProps
import typings.victoryCore.libVictoryPrimitivesLineSegmentMod.LineSegmentProps
import typings.victoryCore.libVictoryPrimitivesPointMod.PointProps
import typings.victoryCore.libVictoryPrimitivesTextMod.TextProps
import typings.victoryCore.libVictoryPrimitivesTypesMod.VictoryPrimitiveShapeProps
import typings.victoryCore.libVictoryPrimitivesWhiskerMod.WhiskerProps
import typings.victoryCore.libVictoryUtilCommonPropsMod.VictoryCommonPrimitiveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryPrimitivesMod {
  
  @JSImport("victory-core/lib/victory-primitives", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Arc {
    
    inline def apply(props: ArcProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("victory-core/lib/victory-primitives", "Arc")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives", "Arc.defaultProps")
    @js.native
    def defaultProps: PathComponent = js.native
    inline def defaultProps_=(x: PathComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-primitives", "Arc.propTypes")
    @js.native
    def propTypes: Active = js.native
    inline def propTypes_=(x: Active): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object Background {
    
    inline def apply(props: BackgroundProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("victory-core/lib/victory-primitives", "Background")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives", "Background.defaultProps")
    @js.native
    def defaultProps: CircleComponent = js.native
    inline def defaultProps_=(x: CircleComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-primitives", "Background.propTypes")
    @js.native
    def propTypes: AriaLabel_ = js.native
    inline def propTypes_=(x: AriaLabel_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object Border {
    
    inline def apply(props: BorderProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("victory-core/lib/victory-primitives", "Border")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives", "Border.defaultProps")
    @js.native
    def defaultProps: RectComponent = js.native
    inline def defaultProps_=(x: RectComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-primitives", "Border.propTypes")
    @js.native
    def propTypes: ClassName = js.native
    inline def propTypes_=(x: ClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  inline def Circle(props: VictoryPrimitiveShapeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Circle")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object ClipPath {
    
    inline def apply(props: ClipPathProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("victory-core/lib/victory-primitives", "ClipPath")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives", "ClipPath.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  inline def Line(props: VictoryPrimitiveShapeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Line")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object LineSegment {
    
    inline def apply(props: LineSegmentProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("victory-core/lib/victory-primitives", "LineSegment")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives", "LineSegment.defaultProps")
    @js.native
    def defaultProps: LineComponent = js.native
    inline def defaultProps_=(x: LineComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-primitives", "LineSegment.propTypes")
    @js.native
    def propTypes: ClipPath = js.native
    inline def propTypes_=(x: ClipPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  inline def Path(props: VictoryPrimitiveShapeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Path")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object Point {
    
    inline def apply(props: PointProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("victory-core/lib/victory-primitives", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives", "Point.defaultProps")
    @js.native
    def defaultProps: PathComponent = js.native
    inline def defaultProps_=(x: PathComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-primitives", "Point.propTypes")
    @js.native
    def propTypes: Data = js.native
    inline def propTypes_=(x: Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  inline def Rect(props: VictoryPrimitiveShapeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Rect")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TSpan(props: VictoryCommonPrimitiveProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TSpan")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object Text {
    
    inline def apply(props: TextProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("victory-core/lib/victory-primitives", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives", "Text.propTypes")
    @js.native
    def propTypes: Desc = js.native
    inline def propTypes_=(x: Desc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  object Whisker {
    
    inline def apply(props: WhiskerProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("victory-core/lib/victory-primitives", "Whisker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-primitives", "Whisker.defaultProps")
    @js.native
    def defaultProps: Role = js.native
    inline def defaultProps_=(x: Role): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-primitives", "Whisker.propTypes")
    @js.native
    def propTypes: DisableInlineStyles = js.native
    inline def propTypes_=(x: DisableInlineStyles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
