package typings.vegaLite

import typings.std.Set
import typings.vegaLite.anon.ChannelFieldDef
import typings.vegaLite.anon.DisallowNonLinearStack
import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.encodingMod.Encoding
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcMarkMod.Mark
import typings.vegaLite.srcMarkMod.MarkDef
import typings.vegaLite.vegaLiteStrings.arc
import typings.vegaLite.vegaLiteStrings.area
import typings.vegaLite.vegaLiteStrings.bar
import typings.vegaLite.vegaLiteStrings.circle
import typings.vegaLite.vegaLiteStrings.geoshape
import typings.vegaLite.vegaLiteStrings.image
import typings.vegaLite.vegaLiteStrings.line
import typings.vegaLite.vegaLiteStrings.point
import typings.vegaLite.vegaLiteStrings.radius
import typings.vegaLite.vegaLiteStrings.rect
import typings.vegaLite.vegaLiteStrings.rule
import typings.vegaLite.vegaLiteStrings.square
import typings.vegaLite.vegaLiteStrings.text
import typings.vegaLite.vegaLiteStrings.theta
import typings.vegaLite.vegaLiteStrings.tick
import typings.vegaLite.vegaLiteStrings.trail
import typings.vegaLite.vegaLiteStrings.x
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcStackMod {
  
  @JSImport("vega-lite/build/src/stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/stack", "STACKABLE_MARKS")
  @js.native
  val STACKABLE_MARKS: Set[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick
  ] = js.native
  
  @JSImport("vega-lite/build/src/stack", "STACK_BY_DEFAULT_MARKS")
  @js.native
  val STACK_BY_DEFAULT_MARKS: Set[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick
  ] = js.native
  
  inline def isStackOffset(s: String): /* is vega-lite.vega-lite/build/src/stack.StackOffset */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStackOffset")(s.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/stack.StackOffset */ Boolean]
  
  inline def stack(m: MarkDef[Mark, ExprRef | SignalRef], encoding: Encoding[String]): StackProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(m.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[StackProperties]
  inline def stack(m: MarkDef[Mark, ExprRef | SignalRef], encoding: Encoding[String], opt: DisallowNonLinearStack): StackProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(m.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[StackProperties]
  inline def stack(m: Mark, encoding: Encoding[String]): StackProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(m.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[StackProperties]
  inline def stack(m: Mark, encoding: Encoding[String], opt: DisallowNonLinearStack): StackProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(m.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[StackProperties]
  
  /* keyof vega-lite.anon.Center */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.zero
    - typings.vegaLite.vegaLiteStrings.center
    - typings.vegaLite.vegaLiteStrings.normalize
  */
  trait StackOffset extends StObject
  
  trait StackProperties extends StObject {
    
    /** Measure axis of the stack. */
    var fieldChannel: x | y | theta | radius
    
    /** Dimension axis of the stack. */
    var groupbyChannel: js.UndefOr[x | y | theta | radius] = js.undefined
    
    /** Field for groupbyChannel. */
    var groupbyField: js.UndefOr[FieldName] = js.undefined
    
    /**
      * Whether this stack will produce impute transform
      */
    var impute: Boolean
    
    /**
      * See `stack` property of Position Field Def.
      */
    var offset: StackOffset
    
    /** Stack-by fields e.g., color, detail */
    var stackBy: js.Array[ChannelFieldDef]
  }
  object StackProperties {
    
    inline def apply(
      fieldChannel: x | y | theta | radius,
      impute: Boolean,
      offset: StackOffset,
      stackBy: js.Array[ChannelFieldDef]
    ): StackProperties = {
      val __obj = js.Dynamic.literal(fieldChannel = fieldChannel.asInstanceOf[js.Any], impute = impute.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], stackBy = stackBy.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackProperties]
    }
    
    extension [Self <: StackProperties](x: Self) {
      
      inline def setFieldChannel(value: typings.vegaLite.vegaLiteStrings.x | y | theta | radius): Self = StObject.set(x, "fieldChannel", value.asInstanceOf[js.Any])
      
      inline def setGroupbyChannel(value: typings.vegaLite.vegaLiteStrings.x | y | theta | radius): Self = StObject.set(x, "groupbyChannel", value.asInstanceOf[js.Any])
      
      inline def setGroupbyChannelUndefined: Self = StObject.set(x, "groupbyChannel", js.undefined)
      
      inline def setGroupbyField(value: FieldName): Self = StObject.set(x, "groupbyField", value.asInstanceOf[js.Any])
      
      inline def setGroupbyFieldUndefined: Self = StObject.set(x, "groupbyField", js.undefined)
      
      inline def setImpute(value: Boolean): Self = StObject.set(x, "impute", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: StackOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setStackBy(value: js.Array[ChannelFieldDef]): Self = StObject.set(x, "stackBy", value.asInstanceOf[js.Any])
      
      inline def setStackByVarargs(value: ChannelFieldDef*): Self = StObject.set(x, "stackBy", js.Array(value :_*))
    }
  }
}
