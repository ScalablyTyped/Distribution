package typings.twemoji

import typings.std.HTMLElement
import typings.twemoji.anon.FromCodePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Twemoji extends StObject {
  
  var convert: FromCodePoint = js.native
  
  def parse(node: String): String = js.native
  def parse(node: String, options: ParseCallback): String = js.native
  def parse(node: String, options: TwemojiOptions): String = js.native
  def parse(node: HTMLElement): HTMLElement = js.native
  def parse(node: HTMLElement, options: ParseCallback): HTMLElement = js.native
  def parse(node: HTMLElement, options: TwemojiOptions): HTMLElement = js.native
}
