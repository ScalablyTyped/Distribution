package typings.webpackMergeAndIncludeGlobally.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dest extends js.Object {
  var dest: String | (js.Function1[/* code */ String, StringDictionary[String]]) = js.native
  var src: js.Array[String] = js.native
}

object Dest {
  @scala.inline
  def apply(dest: String | (js.Function1[/* code */ String, StringDictionary[String]]), src: js.Array[String]): Dest = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dest]
  }
  @scala.inline
  implicit class DestOps[Self <: Dest] (val x: Self) extends AnyVal {
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
    def setDestFunction1(value: /* code */ String => StringDictionary[String]): Self = this.set("dest", js.Any.fromFunction1(value))
    @scala.inline
    def setDest(value: String | (js.Function1[/* code */ String, StringDictionary[String]])): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcVarargs(value: String*): Self = this.set("src", js.Array(value :_*))
    @scala.inline
    def setSrc(value: js.Array[String]): Self = this.set("src", value.asInstanceOf[js.Any])
  }
  
}

