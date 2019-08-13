package typings.videoDotJs.videoDotJsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import typings.std.Error
import typings.std.Node
import typings.videoDotJs.Anon_Children
import typings.videoDotJs.videoDotJsMod.VideoJsPlayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object videojsNs {
  type Child = String | Anon_Children
  type Content = String | Element | Node | (js.Function0[String | Element | Node])
  type LanguageTranslations = StringDictionary[String]
  type Player = typings.videoDotJs.videoDotJsMod.VideoJsPlayer
  type PlayerOptions = VideoJsPlayerOptions
  type XhrCallback = js.Function3[
    /* error */ js.UndefOr[Error], 
    /* response */ js.UndefOr[XhrResponse], 
    /* body */ js.UndefOr[js.Any], 
    Unit
  ]
}
