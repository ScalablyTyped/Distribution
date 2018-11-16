package typings
package xhrLib.xhrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XhrStatic extends XhrInstance {
  @JSName("del")
  var del_Original: XhrInstance = js.native
  @JSName("get")
  var get_Original: XhrInstance = js.native
  @JSName("head")
  var head_Original: XhrInstance = js.native
  @JSName("patch")
  var patch_Original: XhrInstance = js.native
  @JSName("post")
  var post_Original: XhrInstance = js.native
  @JSName("put")
  var put_Original: XhrInstance = js.native
  def del(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def del(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def del(url: java.lang.String, callback: XhrCallback): js.Any = js.native
  def del(url: java.lang.String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
  def get(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def get(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def get(url: java.lang.String, callback: XhrCallback): js.Any = js.native
  def get(url: java.lang.String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
  def head(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def head(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def head(url: java.lang.String, callback: XhrCallback): js.Any = js.native
  def head(url: java.lang.String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
  def patch(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def patch(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def patch(url: java.lang.String, callback: XhrCallback): js.Any = js.native
  def patch(url: java.lang.String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
  def post(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def post(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def post(url: java.lang.String, callback: XhrCallback): js.Any = js.native
  def post(url: java.lang.String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
  def put(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def put(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def put(url: java.lang.String, callback: XhrCallback): js.Any = js.native
  def put(url: java.lang.String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
}

