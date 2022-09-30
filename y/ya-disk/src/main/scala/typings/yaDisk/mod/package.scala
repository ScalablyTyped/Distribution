package typings.yaDisk.mod

import typings.yaDisk.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def info(token: String): js.Promise[Disk] = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(token.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Disk]]

inline def list(token: String, props: ListProps): js.Promise[FilesResourceList] = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(token.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FilesResourceList]]

inline def operations(token: String, id: String): js.Promise[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("operations")(token.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Operation]]

inline def recent(token: String, options: RecentProps): js.Promise[LastUploadedResourceList] = (^.asInstanceOf[js.Dynamic].applyDynamic("recent")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LastUploadedResourceList]]

/* Rewritten from type alias, can be one of: 
  - typings.yaDisk.yaDiskStrings.S
  - typings.yaDisk.yaDiskStrings.M
  - typings.yaDisk.yaDiskStrings.L
  - typings.yaDisk.yaDiskStrings.XL
  - typings.yaDisk.yaDiskStrings.XXL
  - typings.yaDisk.yaDiskStrings.XXXL
  - scala.Double
  - / * template literal string: ${number} * / java.lang.String
*/
type PreviewSize = _PreviewSize | Double | (/* template literal string: ${number} */ String)
