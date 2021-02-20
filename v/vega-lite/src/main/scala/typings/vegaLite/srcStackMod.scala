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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcStackMod {
  
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
  
  @JSImport("vega-lite/build/src/stack", "isStackOffset")
  @js.native
  def isStackOffset(s: String): /* is vega-lite.vega-lite/build/src/stack.StackOffset */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/stack", "stack")
  @js.native
  def stack(m: MarkDef[Mark, ExprRef | SignalRef], encoding: Encoding[String]): StackProperties = js.native
  @JSImport("vega-lite/build/src/stack", "stack")
  @js.native
  def stack(m: MarkDef[Mark, ExprRef | SignalRef], encoding: Encoding[String], opt: DisallowNonLinearStack): StackProperties = js.native
  @JSImport("vega-lite/build/src/stack", "stack")
  @js.native
  def stack(m: Mark, encoding: Encoding[String]): StackProperties = js.native
  @JSImport("vega-lite/build/src/stack", "stack")
  @js.native
  def stack(m: Mark, encoding: Encoding[String], opt: DisallowNonLinearStack): StackProperties = js.native
  
  /* keyof vega-lite.anon.Center */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.zero
    - typings.vegaLite.vegaLiteStrings.center
    - typings.vegaLite.vegaLiteStrings.normalize
  */
  trait StackOffset extends StObject
  
  @js.native
  trait StackProperties extends StObject {
    
    /** Measure axis of the stack. */
    var fieldChannel: x | y | theta | radius = js.native
    
    /** Dimension axis of the stack. */
    var groupbyChannel: js.UndefOr[x | y | theta | radius] = js.native
    
    /** Field for groupbyChannel. */
    var groupbyField: js.UndefOr[FieldName] = js.native
    
    /**
      * Whether this stack will produce impute transform
      */
    var impute: Boolean = js.native
    
    /**
      * See `stack` property of Position Field Def.
      */
    var offset: StackOffset = js.native
    
    /** Stack-by fields e.g., color, detail */
    var stackBy: js.Array[ChannelFieldDef] = js.native
  }
  object StackProperties {
    
    @scala.inline
    def apply(
      fieldChannel: x | y | theta | radius,
      impute: Boolean,
      offset: StackOffset,
      stackBy: js.Array[ChannelFieldDef]
    ): StackProperties = {
      val __obj = js.Dynamic.literal(fieldChannel = fieldChannel.asInstanceOf[js.Any], impute = impute.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], stackBy = stackBy.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackProperties]
    }
    
    @scala.inline
    implicit class StackPropertiesMutableBuilder[Self <: StackProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldChannel(value: typings.vegaLite.vegaLiteStrings.x | y | theta | radius): Self = StObject.set(x, "fieldChannel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupbyChannel(value: typings.vegaLite.vegaLiteStrings.x | y | theta | radius): Self = StObject.set(x, "groupbyChannel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupbyChannelUndefined: Self = StObject.set(x, "groupbyChannel", js.undefined)
      
      @scala.inline
      def setGroupbyField(value: FieldName): Self = StObject.set(x, "groupbyField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupbyFieldUndefined: Self = StObject.set(x, "groupbyField", js.undefined)
      
      @scala.inline
      def setImpute(value: Boolean): Self = StObject.set(x, "impute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: StackOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackBy(value: js.Array[ChannelFieldDef]): Self = StObject.set(x, "stackBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackByVarargs(value: ChannelFieldDef*): Self = StObject.set(x, "stackBy", js.Array(value :_*))
    }
  }
}
