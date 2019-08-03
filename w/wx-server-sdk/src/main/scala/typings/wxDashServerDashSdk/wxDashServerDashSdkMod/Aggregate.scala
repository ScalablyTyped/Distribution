package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import org.scalablytyped.runtime.StringDictionary
import typings.wxDashServerDashSdk.Anon_Boundaries
import typings.wxDashServerDashSdk.Anon_Buckets
import typings.wxDashServerDashSdk.Anon_DistanceField
import typings.wxDashServerDashSdk.Anon_FieldName
import typings.wxDashServerDashSdk.Anon_IncludeArrayIndex
import typings.wxDashServerDashSdk.Anon_NewRoot
import typings.wxDashServerDashSdk.Anon_Size
import typings.wxDashServerDashSdk.wxDashServerDashSdkNumbers.`-1`
import typings.wxDashServerDashSdk.wxDashServerDashSdkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregate extends js.Object {
  def addFields(fieldObj: StringDictionary[js.Any]): Aggregate
  def bucket(bucketObj: Anon_Boundaries): Aggregate
  def bucketAuto(bucketObj: Anon_Buckets): Aggregate
  def count(expr: String): js.Any
  def end(): Unit
  def geoNear(geoNearObj: Anon_DistanceField): Aggregate
  def group(groupObj: Anon_FieldName): Aggregate
  def limit(limitRecords: Double): js.Any
  def `match`(matchObj: StringDictionary[js.Any]): Aggregate
  def project(projectObj: StringDictionary[js.Any]): Aggregate
  def replaceRoot(replaceRootObj: Anon_NewRoot): Aggregate
  def sample(replaceRootObj: Anon_Size): Aggregate
  def skip(skipNum: Double): js.Any
  def sort(replaceRootObj: StringDictionary[`1` | `-1`]): Aggregate
  def sortByCount(fieldName: String): Aggregate
  def unwind(unwindObj: Anon_IncludeArrayIndex): Aggregate
}

object Aggregate {
  @scala.inline
  def apply(
    addFields: StringDictionary[js.Any] => Aggregate,
    bucket: Anon_Boundaries => Aggregate,
    bucketAuto: Anon_Buckets => Aggregate,
    count: String => js.Any,
    end: () => Unit,
    geoNear: Anon_DistanceField => Aggregate,
    group: Anon_FieldName => Aggregate,
    limit: Double => js.Any,
    `match`: StringDictionary[js.Any] => Aggregate,
    project: StringDictionary[js.Any] => Aggregate,
    replaceRoot: Anon_NewRoot => Aggregate,
    sample: Anon_Size => Aggregate,
    skip: Double => js.Any,
    sort: StringDictionary[`1` | `-1`] => Aggregate,
    sortByCount: String => Aggregate,
    unwind: Anon_IncludeArrayIndex => Aggregate
  ): Aggregate = {
    val __obj = js.Dynamic.literal(addFields = js.Any.fromFunction1(addFields), bucket = js.Any.fromFunction1(bucket), bucketAuto = js.Any.fromFunction1(bucketAuto), count = js.Any.fromFunction1(count), end = js.Any.fromFunction0(end), geoNear = js.Any.fromFunction1(geoNear), group = js.Any.fromFunction1(group), limit = js.Any.fromFunction1(limit), project = js.Any.fromFunction1(project), replaceRoot = js.Any.fromFunction1(replaceRoot), sample = js.Any.fromFunction1(sample), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort), sortByCount = js.Any.fromFunction1(sortByCount), unwind = js.Any.fromFunction1(unwind))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Aggregate]
  }
}

