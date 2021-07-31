package typings.winrt.Windows.Storage.Search

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommonFileQuery extends StObject
@JSGlobal("Windows.Storage.Search.CommonFileQuery")
@js.native
object CommonFileQuery extends StObject {
  
  @js.native
  sealed trait defaultQuery
    extends StObject
       with CommonFileQuery
  
  @js.native
  sealed trait orderByDate
    extends StObject
       with CommonFileQuery
  
  @js.native
  sealed trait orderByMusicProperties
    extends StObject
       with CommonFileQuery
  
  @js.native
  sealed trait orderByName
    extends StObject
       with CommonFileQuery
  
  @js.native
  sealed trait orderBySearchRank
    extends StObject
       with CommonFileQuery
  
  @js.native
  sealed trait orderByTitle
    extends StObject
       with CommonFileQuery
}
