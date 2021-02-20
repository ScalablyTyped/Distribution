package typings.wordpressBlocks.anon

import typings.wordpressBlocks.rawHandlingMod.PhrasingContentSchema
import typings.wordpressBlocks.wordpressBlocksStrings.accessKey
import typings.wordpressBlocks.wordpressBlocksStrings.accessKeyLabel
import typings.wordpressBlocks.wordpressBlocksStrings.autocapitalize
import typings.wordpressBlocks.wordpressBlocksStrings.dir
import typings.wordpressBlocks.wordpressBlocksStrings.draggable
import typings.wordpressBlocks.wordpressBlocksStrings.hidden
import typings.wordpressBlocks.wordpressBlocksStrings.innerText
import typings.wordpressBlocks.wordpressBlocksStrings.lang
import typings.wordpressBlocks.wordpressBlocksStrings.offsetHeight
import typings.wordpressBlocks.wordpressBlocksStrings.offsetLeft
import typings.wordpressBlocks.wordpressBlocksStrings.offsetParent
import typings.wordpressBlocks.wordpressBlocksStrings.offsetTop
import typings.wordpressBlocks.wordpressBlocksStrings.offsetWidth
import typings.wordpressBlocks.wordpressBlocksStrings.spellcheck
import typings.wordpressBlocks.wordpressBlocksStrings.title
import typings.wordpressBlocks.wordpressBlocksStrings.translate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends StObject {
  
  val attributes: js.Array[
    accessKey | accessKeyLabel | autocapitalize | dir | draggable | hidden | innerText | lang | offsetHeight | offsetLeft | offsetParent | offsetTop | offsetWidth | spellcheck | title | translate
  ] = js.native
  
  val children: PhrasingContentSchema = js.native
}
object Children {
  
  @scala.inline
  def apply(
    attributes: js.Array[
      accessKey | accessKeyLabel | autocapitalize | dir | draggable | hidden | innerText | lang | offsetHeight | offsetLeft | offsetParent | offsetTop | offsetWidth | spellcheck | title | translate
    ],
    children: PhrasingContentSchema
  ): Children = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(
      value: js.Array[
          accessKey | accessKeyLabel | autocapitalize | dir | draggable | hidden | innerText | lang | offsetHeight | offsetLeft | offsetParent | offsetTop | offsetWidth | spellcheck | title | translate
        ]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(
      value: (accessKey | accessKeyLabel | autocapitalize | dir | draggable | hidden | innerText | lang | offsetHeight | offsetLeft | offsetParent | offsetTop | offsetWidth | spellcheck | title | translate)*
    ): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: PhrasingContentSchema): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
