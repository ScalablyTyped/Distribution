package typings.yar.anon

import typings.hapi.mod.Request
import typings.yar.yarBooleans.`false`
import typings.yar.yarStrings.Lax
import typings.yar.yarStrings.Strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearInvalid extends js.Object {
  
  /**
    * Tells Hapi that if a session cookie is invalid for any reason,
    * to clear it from the browser.
    * This prevents Hapi from having to reprocess the bad cookie on future requests.
    * In general you'll probably want this on,
    * but if you'd prefer that session cookies be dealt with in some
    * other way you may set this to false.
    * Defaults to true
    */
  var clearInvalid: js.UndefOr[Boolean] = js.native
  
  /**
    * an optional function to create custom session IDs.
    * Must retun a string and have the signature function (request) where:
    * request - (optional) is the original request received from the client.
    * Defaults to uuidv4
    */
  var customSessionIDGenerator: js.UndefOr[js.Function1[/* req */ Request, String]] = js.native
  
  /**
    * Tells Hapi that it should not respond with a HTTP 400 error if the session cookie cannot decrypt.
    * This could happen if the cookie is changed on the client, or more likely, if you change the cookie password in your settings.
    * If you want to make this condition send an error like it did in prior versions, change this to `false`,
    * but be aware that if you change your cookie password you will cause 400 errors to be returned to end users.
    * In that case you should probably change this back to true for a short time to allow session cookies to get reset for the best user experience.
    * Defaults to true.
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.native
  
  /**
    * determines whether or not to set HttpOnly option in cookie.
    * Defaults to false.
    */
  var isHttpOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * enables the same-site cookie parameter.
    * Default to 'Lax'.
    */
  var isSameSite: js.UndefOr[Lax | Strict | `false`] = js.native
  
  /**
    * determines whether or not to transfer using TLS/SSL.
    * Defaults to true.
    */
  var isSecure: js.UndefOr[Boolean] = js.native
  
  /**
    * (Required) used to encrypt and sign the cookie data.
    * Must be at least 32 chars.
    */
  var password: String = js.native
  
  /**
    * determines the cookie path.
    * Defaults to '/'.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * sets the time for the cookie to live in the browser, in milliseconds.
    * Defaults to null (session time-life - cookies are deleted when the browser is closed).
    */
  var ttl: js.UndefOr[Double] = js.native
}
object ClearInvalid {
  
  @scala.inline
  def apply(password: String): ClearInvalid = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearInvalid]
  }
  
  @scala.inline
  implicit class ClearInvalidOps[Self <: ClearInvalid] (val x: Self) extends AnyVal {
    
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearInvalid(value: Boolean): Self = this.set("clearInvalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearInvalid: Self = this.set("clearInvalid", js.undefined)
    
    @scala.inline
    def setCustomSessionIDGenerator(value: /* req */ Request => String): Self = this.set("customSessionIDGenerator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomSessionIDGenerator: Self = this.set("customSessionIDGenerator", js.undefined)
    
    @scala.inline
    def setIgnoreErrors(value: Boolean): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("ignoreErrors", js.undefined)
    
    @scala.inline
    def setIsHttpOnly(value: Boolean): Self = this.set("isHttpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHttpOnly: Self = this.set("isHttpOnly", js.undefined)
    
    @scala.inline
    def setIsSameSite(value: Lax | Strict | `false`): Self = this.set("isSameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSameSite: Self = this.set("isSameSite", js.undefined)
    
    @scala.inline
    def setIsSecure(value: Boolean): Self = this.set("isSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSecure: Self = this.set("isSecure", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
}
