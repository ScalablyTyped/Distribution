package typings.yamlFrontMatter

import org.scalablytyped.runtime.StringDictionary
import typings.jsYaml.mod.LoadOptions
import typings.node.Buffer
import typings.yamlFrontMatter.yamlFrontMatterStrings.loadFront
import typings.yamlFrontMatter.yamlFrontMatterStrings.safeLoadFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml-front-matter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def loadFront(content: String): AnonDictkey = js.native
  def loadFront(content: String, options: LoadOptions): AnonDictkey = js.native
  def loadFront(content: Buffer): AnonDictkey = js.native
  def loadFront(content: Buffer, options: LoadOptions): AnonDictkey = js.native
  @JSName("loadFront")
  def loadFront_contentKeyName_String_Intersection[contentKeyName /* <: String */](content: String, options: LoadOptions with AnonContentKeyName[contentKeyName]): loadFront with js.Any with StringDictionary[js.Any] = js.native
  @JSName("loadFront")
  def loadFront_contentKeyName_String_Intersection[contentKeyName /* <: String */](content: Buffer, options: LoadOptions with AnonContentKeyName[contentKeyName]): loadFront with js.Any with StringDictionary[js.Any] = js.native
  def safeLoadFront(content: String): AnonDictkey = js.native
  def safeLoadFront(content: String, options: LoadOptions): AnonDictkey = js.native
  def safeLoadFront(content: Buffer): AnonDictkey = js.native
  def safeLoadFront(content: Buffer, options: LoadOptions): AnonDictkey = js.native
  @JSName("safeLoadFront")
  def safeLoadFront_contentKeyName_String_Intersection[contentKeyName /* <: String */](content: String, options: LoadOptions with AnonContentKeyName[contentKeyName]): safeLoadFront with js.Any with StringDictionary[js.Any] = js.native
  @JSName("safeLoadFront")
  def safeLoadFront_contentKeyName_String_Intersection[contentKeyName /* <: String */](content: Buffer, options: LoadOptions with AnonContentKeyName[contentKeyName]): safeLoadFront with js.Any with StringDictionary[js.Any] = js.native
}

