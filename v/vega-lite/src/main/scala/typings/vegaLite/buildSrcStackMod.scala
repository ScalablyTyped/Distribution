package typings.vegaLite

import typings.std.Set
import typings.vegaLite.anon.ChannelFieldDef
import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcEncodingMod.Encoding
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcMarkMod.Mark
import typings.vegaLite.buildSrcMarkMod.MarkDef
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
import typings.vegaLite.vegaLiteStrings.xOffset
import typings.vegaLite.vegaLiteStrings.y
import typings.vegaLite.vegaLiteStrings.yOffset
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcStackMod {
  
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
  inline def stack(m: Mark, encoding: Encoding[String]): StackProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("stack")(m.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[StackProperties]
  
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
    var groupbyChannels: js.Array[x | y | theta | radius | xOffset | yOffset]
    
    /** Field for groupbyChannel. */
    var groupbyFields: Set[FieldName]
    
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
      groupbyChannels: js.Array[x | y | theta | radius | xOffset | yOffset],
      groupbyFields: Set[FieldName],
      impute: Boolean,
      offset: StackOffset,
      stackBy: js.Array[ChannelFieldDef]
    ): StackProperties = {
      val __obj = js.Dynamic.literal(fieldChannel = fieldChannel.asInstanceOf[js.Any], groupbyChannels = groupbyChannels.asInstanceOf[js.Any], groupbyFields = groupbyFields.asInstanceOf[js.Any], impute = impute.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], stackBy = stackBy.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StackProperties] (val x: Self) extends AnyVal {
      
      inline def setFieldChannel(value: typings.vegaLite.vegaLiteStrings.x | y | theta | radius): Self = StObject.set(x, "fieldChannel", value.asInstanceOf[js.Any])
      
      inline def setGroupbyChannels(value: js.Array[typings.vegaLite.vegaLiteStrings.x | y | theta | radius | xOffset | yOffset]): Self = StObject.set(x, "groupbyChannels", value.asInstanceOf[js.Any])
      
      inline def setGroupbyChannelsVarargs(value: (typings.vegaLite.vegaLiteStrings.x | y | theta | radius | xOffset | yOffset)*): Self = StObject.set(x, "groupbyChannels", js.Array(value*))
      
      inline def setGroupbyFields(value: Set[FieldName]): Self = StObject.set(x, "groupbyFields", value.asInstanceOf[js.Any])
      
      inline def setImpute(value: Boolean): Self = StObject.set(x, "impute", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: StackOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setStackBy(value: js.Array[ChannelFieldDef]): Self = StObject.set(x, "stackBy", value.asInstanceOf[js.Any])
      
      inline def setStackByVarargs(value: ChannelFieldDef*): Self = StObject.set(x, "stackBy", js.Array(value*))
    }
  }
}
