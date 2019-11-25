package typings.webpackbar

import typings.webpackbar.webpackbarMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ext extends js.Object {
  var ext: Stats
  var loader: Stats
}

object Anon_Ext {
  @scala.inline
  def apply(ext: Stats, loader: Stats): Anon_Ext = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Ext]
  }
}

