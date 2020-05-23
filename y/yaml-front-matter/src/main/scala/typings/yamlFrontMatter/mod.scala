package typings.yamlFrontMatter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.jsYaml.mod.LoadOptions
import typings.node.Buffer
import typings.yamlFrontMatter.anon.ContentKeyName
import typings.yamlFrontMatter.anon.Dictkey
import typings.yamlFrontMatter.yamlFrontMatterStrings.loadFront
import typings.yamlFrontMatter.yamlFrontMatterStrings.safeLoadFront
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yaml-front-matter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def loadFront(content: String): Dictkey = js.native
  def loadFront(content: String, options: LoadOptions): Dictkey = js.native
  def loadFront(content: Buffer): Dictkey = js.native
  def loadFront(content: Buffer, options: LoadOptions): Dictkey = js.native
  @JSName("loadFront")
  def loadFront_contentKeyName_String_Intersection[contentKeyName /* <: String */](content: String, options: LoadOptions with ContentKeyName[contentKeyName]): loadFront with TopLevel[js.Any] with StringDictionary[js.Any] = js.native
  @JSName("loadFront")
  def loadFront_contentKeyName_String_Intersection[contentKeyName /* <: String */](content: Buffer, options: LoadOptions with ContentKeyName[contentKeyName]): loadFront with TopLevel[js.Any] with StringDictionary[js.Any] = js.native
  def safeLoadFront(content: String): Dictkey = js.native
  def safeLoadFront(content: String, options: LoadOptions): Dictkey = js.native
  def safeLoadFront(content: Buffer): Dictkey = js.native
  def safeLoadFront(content: Buffer, options: LoadOptions): Dictkey = js.native
  @JSName("safeLoadFront")
  def safeLoadFront_contentKeyName_String_Intersection[contentKeyName /* <: String */](content: String, options: LoadOptions with ContentKeyName[contentKeyName]): safeLoadFront with TopLevel[js.Any] with StringDictionary[js.Any] = js.native
  @JSName("safeLoadFront")
  def safeLoadFront_contentKeyName_String_Intersection[contentKeyName /* <: String */](content: Buffer, options: LoadOptions with ContentKeyName[contentKeyName]): safeLoadFront with TopLevel[js.Any] with StringDictionary[js.Any] = js.native
}

