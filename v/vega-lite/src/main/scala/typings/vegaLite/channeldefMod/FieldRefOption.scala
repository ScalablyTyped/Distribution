package typings.vegaLite.channeldefMod

import typings.vegaLite.vegaLiteStrings.datum
import typings.vegaLite.vegaLiteStrings.datumDotdatum
import typings.vegaLite.vegaLiteStrings.end
import typings.vegaLite.vegaLiteStrings.mid
import typings.vegaLite.vegaLiteStrings.parent
import typings.vegaLite.vegaLiteStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldRefOption extends StObject {
  
  /** Append suffix to the field ref for bin (default='start') */
  var binSuffix: js.UndefOr[end | range | mid] = js.native
  
  /** Wrap the field with datum, parent, or datum.datum (e.g., datum['...'] for Vega Expression */
  var expr: js.UndefOr[datum | parent | datumDotdatum] = js.native
  
  /**
    * Use the field name for `as` in a transform.
    * We will not escape nested accesses because Vega transform outputs cannot be nested.
    */
  var forAs: js.UndefOr[Boolean] = js.native
  
  /** Exclude bin, aggregate, timeUnit */
  var nofn: js.UndefOr[Boolean] = js.native
  
  /** Prepend fn with custom function prefix */
  var prefix: js.UndefOr[String] = js.native
  
  /** Append suffix to the field ref (general) */
  var suffix: js.UndefOr[String] = js.native
}
object FieldRefOption {
  
  @scala.inline
  def apply(): FieldRefOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldRefOption]
  }
  
  @scala.inline
  implicit class FieldRefOptionMutableBuilder[Self <: FieldRefOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinSuffix(value: end | range | mid): Self = StObject.set(x, "binSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinSuffixUndefined: Self = StObject.set(x, "binSuffix", js.undefined)
    
    @scala.inline
    def setExpr(value: datum | parent | datumDotdatum): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    @scala.inline
    def setForAs(value: Boolean): Self = StObject.set(x, "forAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForAsUndefined: Self = StObject.set(x, "forAs", js.undefined)
    
    @scala.inline
    def setNofn(value: Boolean): Self = StObject.set(x, "nofn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNofnUndefined: Self = StObject.set(x, "nofn", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
  }
}
