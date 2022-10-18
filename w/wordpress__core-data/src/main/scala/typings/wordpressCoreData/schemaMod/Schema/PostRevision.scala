package typings.wordpressCoreData.schemaMod.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// prettier-ignore
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends 'embed' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePostRevision<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.EmbedKeys.PostRevision> : T extends 'view' ? std.Pick<@wordpress/core-data.@wordpress/core-data/schema.Schema.BasePostRevision<T>, @wordpress/core-data.@wordpress/core-data/schema.Schema.ViewKeys.PostRevision> : @wordpress/core-data.@wordpress/core-data/schema.Schema.BasePostRevision<T>
  }}}
  */
@js.native
trait PostRevision[T /* <: Context */] extends StObject
