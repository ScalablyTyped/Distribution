package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
  /**
    * Request
    *
    * @param urlOpts - request url or options.
    * @param options - options.
    */
  def apply(urlOpts: RequestUrlOpts): RequestPromise = js.native
  def apply(urlOpts: RequestUrlOpts, options: RequestOptions): RequestPromise = js.native
  
  /**
    * Execute a request with method DELETE.
    *
    * @param urlOpts - request url or options.
    * @param options - options.
    */
  def delete(urlOpts: RequestUrlOpts): RequestPromise = js.native
  def delete(urlOpts: RequestUrlOpts, options: RequestOptions): RequestPromise = js.native
  
  /**
    * Execute a request with method GET.
    *
    * @param urlOpts - request url or options.
    * @param options - options.
    */
  def get(urlOpts: RequestUrlOpts): RequestPromise = js.native
  def get(urlOpts: RequestUrlOpts, options: RequestOptions): RequestPromise = js.native
  
  /**
    * Execute a request with method HEAD.
    *
    * @param urlOpts - request url or options.
    * @param options - options.
    */
  def head(urlOpts: RequestUrlOpts): RequestPromise = js.native
  def head(urlOpts: RequestUrlOpts, options: RequestOptions): RequestPromise = js.native
  
  /**
    * Execute a request with method PATCH.
    *
    * @param urlOpts - request url or options.
    * @param options - options.
    */
  def patch(urlOpts: RequestUrlOpts): RequestPromise = js.native
  def patch(urlOpts: RequestUrlOpts, options: RequestOptions): RequestPromise = js.native
  
  /**
    * Execute a request with method POST.
    *
    * @param urlOpts - request url or options.
    * @param options - options.
    */
  def post(urlOpts: RequestUrlOpts): RequestPromise = js.native
  def post(urlOpts: RequestUrlOpts, options: RequestOptions): RequestPromise = js.native
  
  /**
    * Execute a request with method PUT.
    *
    * @param urlOpts - request url or options.
    * @param options - options.
    */
  def put(urlOpts: RequestUrlOpts): RequestPromise = js.native
  def put(urlOpts: RequestUrlOpts, options: RequestOptions): RequestPromise = js.native
}
