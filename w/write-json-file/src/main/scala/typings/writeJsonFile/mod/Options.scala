package typings.writeJsonFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		Detect indentation automatically if the file exists.
  		@default false
  		*/
  val detectIndent: js.UndefOr[Boolean] = js.native
  
  /**
  		Indentation as a string or number of spaces. Pass in `undefined` for no formatting.
  		@default '\t'
  		*/
  val indent: js.UndefOr[String | Double] = js.native
  
  /**
  		Mode used when writing the file.
  		@default 0o666
  		*/
  val mode: js.UndefOr[Double] = js.native
  
  /**
  		Passed into `JSON.stringify`.
  		*/
  val replacer: js.UndefOr[Replacer | (js.Array[Double | String])] = js.native
  
  /**
  		Sort the keys recursively. Optionally pass in a compare function.
  		@default false
  		*/
  val sortKeys: js.UndefOr[Boolean | SortKeys] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDetectIndent(value: Boolean): Self = this.set("detectIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectIndent: Self = this.set("detectIndent", js.undefined)
    
    @scala.inline
    def setIndent(value: String | Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setReplacerVarargs(value: (Double | String)*): Self = this.set("replacer", js.Array(value :_*))
    
    @scala.inline
    def setReplacer(value: Replacer | (js.Array[Double | String])): Self = this.set("replacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacer: Self = this.set("replacer", js.undefined)
    
    @scala.inline
    def setSortKeysFunction2(value: (/* a */ String, /* b */ String) => Double): Self = this.set("sortKeys", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortKeys(value: Boolean | SortKeys): Self = this.set("sortKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortKeys: Self = this.set("sortKeys", js.undefined)
  }
}
