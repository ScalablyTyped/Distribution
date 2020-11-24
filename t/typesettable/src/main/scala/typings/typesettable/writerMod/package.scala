package typings.typesettable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object writerMod {
  
  type IPenFactory[T] = js.Function3[
    /* text */ java.lang.String, 
    /* transform */ typings.typesettable.writerMod.ITransform, 
    /* container */ js.UndefOr[T], 
    typings.typesettable.writerMod.IPen
  ]
}
