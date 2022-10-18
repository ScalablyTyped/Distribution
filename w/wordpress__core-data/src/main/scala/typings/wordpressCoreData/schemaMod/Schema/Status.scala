package typings.wordpressCoreData.schemaMod.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends 'embed' ? / * Inlined std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseStatus, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.Status> * /
{  _embedded :std.Record<string, std.Array<any>> | undefined | undefined,   _links :std.Record<string, std.Array<{  href :string, [k: string] : any}>>,   name :string,   slug :string} : T extends 'view' ? / * Inlined std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BaseStatus, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.Status> * /
{  queryable :boolean,   _embedded :std.Record<string, std.Array<any>> | undefined | undefined,   _links :std.Record<string, std.Array<{  href :string, [k: string] : any}>>,   slug :string,   name :string,   public :boolean} : @wordpress/core-data.@wordpress/core-data/schema.Schema.BaseStatus
  }}}
  */
@js.native
trait Status[T /* <: Context */] extends StObject
