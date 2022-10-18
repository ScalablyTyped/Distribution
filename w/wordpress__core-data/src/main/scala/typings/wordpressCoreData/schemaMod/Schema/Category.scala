package typings.wordpressCoreData.schemaMod.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends 'embed' ? / * Inlined std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseCategory, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Category> * /
{  taxonomy :@wordpress/core-data.@wordpress/core-data/schema.Schema.TaxonomyKind,   _embedded :std.Record<string, std.Array<any>> | undefined | undefined,   _links :std.Record<string, std.Array<{  href :string, [k: string] : any}>>,   slug :string,   name :string,   id :number,   link :string} : T extends 'view' ? / * Inlined std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseCategory, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Category> * /
{  description :string,   meta :std.Array<any>,   taxonomy :@wordpress/core-data.@wordpress/core-data/schema.Schema.TaxonomyKind,   _embedded :std.Record<string, std.Array<any>> | undefined | undefined,   _links :std.Record<string, std.Array<{  href :string, [k: string] : any}>>,   parent :number,   slug :string,   count :number,   name :string,   id :number,   link :string} : @wordpress/core-data.@wordpress/core-data/schema.Schema.BaseCategory
  }}}
  */
@js.native
trait Category[T /* <: Context */] extends StObject
