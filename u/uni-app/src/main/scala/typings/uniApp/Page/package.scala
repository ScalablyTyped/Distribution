package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Page {
  
  type GetCurrentPages = js.Function0[
    js.Array[
      (typings.uniApp.Page.PageInstance[typings.uniApp.AnyObject, js.Object]) with js.Object
    ]
  ]
  
  type PageConstructor = js.Function1[
    /* options */ (typings.uniApp.Page.PageInstance[
      typings.uniApp.AnyObject, 
      typings.uniApp.AnyObject with (typings.uniApp.Page.PageInstance[_, _])
    ]) with typings.uniApp.AnyObject with (typings.uniApp.Page.PageInstance[_, _]), 
    scala.Unit
  ]
}
