package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeParser extends js.Object {
  
  def collapseNames(obj: js.Any): StringDictionary[js.Any] = js.native
  
  def expandNames(obj: StringDictionary[js.Any]): js.Any = js.native
}
object CodeParser {
  
  @scala.inline
  def apply(collapseNames: js.Any => StringDictionary[js.Any], expandNames: StringDictionary[js.Any] => js.Any): CodeParser = {
    val __obj = js.Dynamic.literal(collapseNames = js.Any.fromFunction1(collapseNames), expandNames = js.Any.fromFunction1(expandNames))
    __obj.asInstanceOf[CodeParser]
  }
  
  @scala.inline
  implicit class CodeParserOps[Self <: CodeParser] (val x: Self) extends AnyVal {
    
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
    def setCollapseNames(value: js.Any => StringDictionary[js.Any]): Self = this.set("collapseNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandNames(value: StringDictionary[js.Any] => js.Any): Self = this.set("expandNames", js.Any.fromFunction1(value))
  }
}
