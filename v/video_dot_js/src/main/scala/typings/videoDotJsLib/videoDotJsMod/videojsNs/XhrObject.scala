package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XhrObject extends Xhr {
  @JSName("del")
  var del_Original: Xhr = js.native
  @JSName("get")
  var get_Original: Xhr = js.native
  @JSName("head")
  var head_Original: Xhr = js.native
  @JSName("patch")
  var patch_Original: Xhr = js.native
  @JSName("post")
  var post_Original: Xhr = js.native
  @JSName("put")
  var put_Original: Xhr = js.native
  def del(url: java.lang.String, callback: XhrCallback): js.Any = js.native
  def del(url: java.lang.String, options: XhrOptions, callback: XhrCallback): js.Any = js.native
  def del(url: XhrOptions, callback: XhrCallback): js.Any = js.native
  def get(url: java.lang.String, callback: XhrCallback): js.Any = js.native
  def get(url: java.lang.String, options: XhrOptions, callback: XhrCallback): js.Any = js.native
  def get(url: XhrOptions, callback: XhrCallback): js.Any = js.native
  def head(url: java.lang.String, callback: XhrCallback): js.Any = js.native
  def head(url: java.lang.String, options: XhrOptions, callback: XhrCallback): js.Any = js.native
  def head(url: XhrOptions, callback: XhrCallback): js.Any = js.native
  def patch(url: java.lang.String, callback: XhrCallback): js.Any = js.native
  def patch(url: java.lang.String, options: XhrOptions, callback: XhrCallback): js.Any = js.native
  def patch(url: XhrOptions, callback: XhrCallback): js.Any = js.native
  def post(url: java.lang.String, callback: XhrCallback): js.Any = js.native
  def post(url: java.lang.String, options: XhrOptions, callback: XhrCallback): js.Any = js.native
  def post(url: XhrOptions, callback: XhrCallback): js.Any = js.native
  def put(url: java.lang.String, callback: XhrCallback): js.Any = js.native
  def put(url: java.lang.String, options: XhrOptions, callback: XhrCallback): js.Any = js.native
  def put(url: XhrOptions, callback: XhrCallback): js.Any = js.native
}

