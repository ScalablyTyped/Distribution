package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergedModifiers extends js.Object {
  
  var mergedModifiers: StringDictionary[js.Function2[/* date */ typings.std.Date, /* type */ String, Boolean]] = js.native
}
object MergedModifiers {
  
  @scala.inline
  def apply(
    mergedModifiers: StringDictionary[js.Function2[/* date */ typings.std.Date, /* type */ String, Boolean]]
  ): MergedModifiers = {
    val __obj = js.Dynamic.literal(mergedModifiers = mergedModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergedModifiers]
  }
  
  @scala.inline
  implicit class MergedModifiersOps[Self <: MergedModifiers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMergedModifiers(value: StringDictionary[js.Function2[/* date */ typings.std.Date, /* type */ String, Boolean]]): Self = this.set("mergedModifiers", value.asInstanceOf[js.Any])
  }
}
