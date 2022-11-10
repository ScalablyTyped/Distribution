package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type EventHash = StringDictionary[WebixCallback]

/* Rewritten from type alias, can be one of: 
  - typings.webix.webixStrings.binary
  - typings.webix.webixStrings.GraphQL
  - typings.webix.webixStrings.json
  - typings.webix.webixStrings.post
  - typings.webix.webixStrings.rest
  - typings.webix.webixStrings.debug
  - java.lang.String
*/
type ProxyName = _ProxyName | String

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends 'binary' ? webix.webix.binaryProxy : T extends 'GraphQL' ? webix.webix.GraphQLProxy : T extends 'json' ? webix.webix.jsonProxy : T extends 'post' ? webix.webix.postProxy : T extends 'rest' ? webix.webix.restProxy : T extends 'debug' ? webix.webix.debugProxy : webix.webix.WebixProxy
  }}}
  */
type ProxyType[T] = binaryProxy

type ganttNumEditor = textEditor

type obj = StringDictionary[Any]
