package typings.styleSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Syntax feature options all accept three keywords:"skip", "check", "only".
  * An error will be thrown if you use "only" more than once
  */
@js.native
trait Options extends js.Object {
  
  /**
    * This includes both standard `/ * CSS comments *\/`
    * and non-standard but widely used `// single line comments`.
    * @default 'skip'
    */
  var comments: js.UndefOr[SyntaxFeatureOption] = js.native
  
  /**
    * @default 'check'
    */
  var functionArguments: js.UndefOr[SyntaxFeatureOption] = js.native
  
  /**
    * @default 'skip'
    */
  var functionNames: js.UndefOr[SyntaxFeatureOption] = js.native
  
  /**
    * If true, the search will stop after one match is found.
    * @default false
    */
  var once: js.UndefOr[Boolean] = js.native
  
  /**
    * This designates anything inside parentheses, which includes standard functions,but also Sass maps and other non-standard constructs.
    * `parentheticals` is a broader category than `functionArguments`
    * @default 'check'
    */
  var parentheticals: js.UndefOr[SyntaxFeatureOption] = js.native
  
  /** The source string to search through. */
  var source: String = js.native
  
  /**
    * @default 'skip'
    */
  var strings: js.UndefOr[SyntaxFeatureOption] = js.native
  
  /**
    * The target of the search. Can be
    * - a single character
    * - a string with some length
    * - an array of strings, all of which count as matches
    * (the match object passed to the callback will differentiate which string in the array
    * got matched via its target property)
    */
  var target: String | js.Array[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(source: String, target: String | js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: String*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: String | js.Array[String]): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: SyntaxFeatureOption): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setFunctionArguments(value: SyntaxFeatureOption): Self = this.set("functionArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionArguments: Self = this.set("functionArguments", js.undefined)
    
    @scala.inline
    def setFunctionNames(value: SyntaxFeatureOption): Self = this.set("functionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionNames: Self = this.set("functionNames", js.undefined)
    
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    
    @scala.inline
    def setParentheticals(value: SyntaxFeatureOption): Self = this.set("parentheticals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentheticals: Self = this.set("parentheticals", js.undefined)
    
    @scala.inline
    def setStrings(value: SyntaxFeatureOption): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
  }
}
