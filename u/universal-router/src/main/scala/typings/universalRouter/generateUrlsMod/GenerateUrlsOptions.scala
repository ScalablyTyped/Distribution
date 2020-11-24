package typings.universalRouter.generateUrlsMod

import typings.pathToRegexp.mod.ParseOptions
import typings.pathToRegexp.mod.TokensToFunctionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateUrlsOptions
  extends ParseOptions
     with TokensToFunctionOptions {
  
  /**
    * Add a query string to generated url based on unknown route params.
    */
  var stringifyQueryParams: js.UndefOr[js.Function1[/* params */ UrlParams, String]] = js.native
}
object GenerateUrlsOptions {
  
  @scala.inline
  def apply(): GenerateUrlsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateUrlsOptions]
  }
  
  @scala.inline
  implicit class GenerateUrlsOptionsOps[Self <: GenerateUrlsOptions] (val x: Self) extends AnyVal {
    
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
    def setStringifyQueryParams(value: /* params */ UrlParams => String): Self = this.set("stringifyQueryParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStringifyQueryParams: Self = this.set("stringifyQueryParams", js.undefined)
  }
}
