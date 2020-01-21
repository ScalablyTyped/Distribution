package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.wxServerSdk.AnonBoundaries
import typings.wxServerSdk.AnonBuckets
import typings.wxServerSdk.AnonDistanceField
import typings.wxServerSdk.AnonFieldName
import typings.wxServerSdk.AnonIncludeArrayIndex
import typings.wxServerSdk.AnonNewRoot
import typings.wxServerSdk.AnonSize
import typings.wxServerSdk.wxServerSdkNumbers.`-1`
import typings.wxServerSdk.wxServerSdkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregate extends js.Object {
  def addFields(fieldObj: StringDictionary[js.Any]): Aggregate
  def bucket(bucketObj: AnonBoundaries): Aggregate
  def bucketAuto(bucketObj: AnonBuckets): Aggregate
  def count(expr: String): js.Any
  def end(): Unit
  def geoNear(geoNearObj: AnonDistanceField): Aggregate
  def group(groupObj: AnonFieldName): Aggregate
  def limit(limitRecords: Double): js.Any
  def `match`(matchObj: StringDictionary[js.Any]): Aggregate
  def project(projectObj: StringDictionary[js.Any]): Aggregate
  def replaceRoot(replaceRootObj: AnonNewRoot): Aggregate
  def sample(replaceRootObj: AnonSize): Aggregate
  def skip(skipNum: Double): js.Any
  def sort(replaceRootObj: StringDictionary[`1` | `-1`]): Aggregate
  def sortByCount(fieldName: String): Aggregate
  def unwind(unwindObj: AnonIncludeArrayIndex): Aggregate
}

object Aggregate {
  @scala.inline
  def apply(
    addFields: StringDictionary[js.Any] => Aggregate,
    bucket: AnonBoundaries => Aggregate,
    bucketAuto: AnonBuckets => Aggregate,
    count: String => js.Any,
    end: () => Unit,
    geoNear: AnonDistanceField => Aggregate,
    group: AnonFieldName => Aggregate,
    limit: Double => js.Any,
    `match`: StringDictionary[js.Any] => Aggregate,
    project: StringDictionary[js.Any] => Aggregate,
    replaceRoot: AnonNewRoot => Aggregate,
    sample: AnonSize => Aggregate,
    skip: Double => js.Any,
    sort: StringDictionary[`1` | `-1`] => Aggregate,
    sortByCount: String => Aggregate,
    unwind: AnonIncludeArrayIndex => Aggregate
  ): Aggregate = {
    val __obj = js.Dynamic.literal(addFields = js.Any.fromFunction1(addFields), bucket = js.Any.fromFunction1(bucket), bucketAuto = js.Any.fromFunction1(bucketAuto), count = js.Any.fromFunction1(count), end = js.Any.fromFunction0(end), geoNear = js.Any.fromFunction1(geoNear), group = js.Any.fromFunction1(group), limit = js.Any.fromFunction1(limit), project = js.Any.fromFunction1(project), replaceRoot = js.Any.fromFunction1(replaceRoot), sample = js.Any.fromFunction1(sample), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort), sortByCount = js.Any.fromFunction1(sortByCount), unwind = js.Any.fromFunction1(unwind))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Aggregate]
  }
}

