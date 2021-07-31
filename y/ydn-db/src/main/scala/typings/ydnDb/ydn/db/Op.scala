package typings.ydnDb.ydn.db

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Op extends StObject
@JSGlobal("ydn.db.Op")
@js.native
object Op extends StObject {
  
  @js.native
  sealed trait ^
    extends StObject
       with Op
  
  @js.native
  sealed trait Equalssign
    extends StObject
       with Op
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with Op
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with Op
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with Op
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with Op
}
