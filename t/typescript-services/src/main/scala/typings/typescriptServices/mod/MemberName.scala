package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "MemberName")
@js.native
open class MemberName ()
  extends StObject
     with typings.typescriptServices.TypeScript.MemberName {
  
  /* CompleteClass */
  override def isArray(): Boolean = js.native
  
  /* CompleteClass */
  override def isMarker(): Boolean = js.native
  
  /* CompleteClass */
  override def isString(): Boolean = js.native
  
  /* CompleteClass */
  var prefix: String = js.native
  
  /* CompleteClass */
  var suffix: String = js.native
}
object MemberName {
  
  @JSImport("typescript-services", "MemberName")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(entry: typings.typescriptServices.TypeScript.MemberName, prefix: String, suffix: String): typings.typescriptServices.TypeScript.MemberName = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(entry.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], suffix.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.MemberName]
  /* static member */
  inline def create(text: String): typings.typescriptServices.TypeScript.MemberName = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(text.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.MemberName]
  
  /* static member */
  inline def memberNameToString(memberName: typings.typescriptServices.TypeScript.MemberName): String = ^.asInstanceOf[js.Dynamic].applyDynamic("memberNameToString")(memberName.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def memberNameToString(memberName: typings.typescriptServices.TypeScript.MemberName, markerInfo: js.Array[Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("memberNameToString")(memberName.asInstanceOf[js.Any], markerInfo.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def memberNameToString(
    memberName: typings.typescriptServices.TypeScript.MemberName,
    markerInfo: js.Array[Double],
    markerBaseLength: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("memberNameToString")(memberName.asInstanceOf[js.Any], markerInfo.asInstanceOf[js.Any], markerBaseLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def memberNameToString(
    memberName: typings.typescriptServices.TypeScript.MemberName,
    markerInfo: Unit,
    markerBaseLength: Double
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("memberNameToString")(memberName.asInstanceOf[js.Any], markerInfo.asInstanceOf[js.Any], markerBaseLength.asInstanceOf[js.Any])).asInstanceOf[String]
}
