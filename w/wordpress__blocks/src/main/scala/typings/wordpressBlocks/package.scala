package typings.wordpressBlocks

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BlockAttributes = Record[String, Any]

/** 
NOTE: Rewritten from type alias:
{{{
type InnerBlockTemplate = [string, @wordpress/blocks.BlockAttributes | undefined, std.Array<@wordpress/blocks.InnerBlockTemplate> | undefined]
}}}
to avoid circular code involving: 
- @wordpress/blocks.InnerBlockTemplate
*/
type InnerBlockTemplate = js.Tuple3[String, js.UndefOr[BlockAttributes], js.UndefOr[js.Array[Any]]]
