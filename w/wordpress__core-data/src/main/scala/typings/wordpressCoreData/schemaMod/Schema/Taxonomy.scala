package typings.wordpressCoreData.schemaMod.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends 'embed' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseTaxonomy<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Taxonomy> : T extends 'view' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseTaxonomy<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Taxonomy> : @wordpress/core-data.@wordpress/core-data/schema.Schema.BaseTaxonomy<T>
  }}}
  */
@js.native
trait Taxonomy[T /* <: Context */] extends StObject
