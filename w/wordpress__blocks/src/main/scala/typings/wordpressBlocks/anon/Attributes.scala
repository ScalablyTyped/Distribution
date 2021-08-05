package typings.wordpressBlocks.anon

import typings.wordpressBlocks.rawHandlingMod.PhrasingContentSchema
import typings.wordpressBlocks.wordpressBlocksStrings.`type`
import typings.wordpressBlocks.wordpressBlocksStrings.charset
import typings.wordpressBlocks.wordpressBlocksStrings.coords
import typings.wordpressBlocks.wordpressBlocksStrings.download
import typings.wordpressBlocks.wordpressBlocksStrings.hreflang
import typings.wordpressBlocks.wordpressBlocksStrings.name
import typings.wordpressBlocks.wordpressBlocksStrings.ping
import typings.wordpressBlocks.wordpressBlocksStrings.referrerPolicy
import typings.wordpressBlocks.wordpressBlocksStrings.rel
import typings.wordpressBlocks.wordpressBlocksStrings.relList
import typings.wordpressBlocks.wordpressBlocksStrings.rev
import typings.wordpressBlocks.wordpressBlocksStrings.shape
import typings.wordpressBlocks.wordpressBlocksStrings.target
import typings.wordpressBlocks.wordpressBlocksStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  val attributes: js.Array[
    charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`
  ]
  
  val children: PhrasingContentSchema
}
object Attributes {
  
  inline def apply(
    attributes: js.Array[
      charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`
    ],
    children: PhrasingContentSchema
  ): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  extension [Self <: Attributes](x: Self) {
    
    inline def setAttributes(
      value: js.Array[
          charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`
        ]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(
      value: (charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`)*
    ): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setChildren(value: PhrasingContentSchema): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
