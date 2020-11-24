package typings.xhr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XhrStatic extends XhrInstance {
  
  def del(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def del(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def del(url: String, callback: XhrCallback): js.Any = js.native
  def del(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
  @JSName("del")
  var del_Original: XhrInstance = js.native
  
  def get(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def get(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def get(url: String, callback: XhrCallback): js.Any = js.native
  def get(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
  @JSName("get")
  var get_Original: XhrInstance = js.native
  
  def head(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def head(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def head(url: String, callback: XhrCallback): js.Any = js.native
  def head(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
  @JSName("head")
  var head_Original: XhrInstance = js.native
  
  def patch(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def patch(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def patch(url: String, callback: XhrCallback): js.Any = js.native
  def patch(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
  @JSName("patch")
  var patch_Original: XhrInstance = js.native
  
  def post(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def post(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def post(url: String, callback: XhrCallback): js.Any = js.native
  def post(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
  @JSName("post")
  var post_Original: XhrInstance = js.native
  
  def put(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def put(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def put(url: String, callback: XhrCallback): js.Any = js.native
  def put(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
  @JSName("put")
  var put_Original: XhrInstance = js.native
}
