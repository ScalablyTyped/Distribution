package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.wxServerSdk.anon.Boundaries
import typings.wxServerSdk.anon.Buckets
import typings.wxServerSdk.anon.DictfieldName
import typings.wxServerSdk.anon.DistanceField
import typings.wxServerSdk.anon.IncludeArrayIndex
import typings.wxServerSdk.anon.NewRoot
import typings.wxServerSdk.anon.Size
import typings.wxServerSdk.wxServerSdkNumbers.`-1`
import typings.wxServerSdk.wxServerSdkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregate extends js.Object {
  def addFields(fieldObj: StringDictionary[js.Any]): Aggregate
  def bucket(bucketObj: Boundaries): Aggregate
  def bucketAuto(bucketObj: Buckets): Aggregate
  def count(expr: String): js.Any
  def end(): Unit
  def geoNear(geoNearObj: DistanceField): Aggregate
  def group(groupObj: DictfieldName): Aggregate
  def limit(limitRecords: Double): js.Any
  def `match`(matchObj: StringDictionary[js.Any]): Aggregate
  def project(projectObj: StringDictionary[js.Any]): Aggregate
  def replaceRoot(replaceRootObj: NewRoot): Aggregate
  def sample(replaceRootObj: Size): Aggregate
  def skip(skipNum: Double): js.Any
  def sort(replaceRootObj: StringDictionary[`1` | `-1`]): Aggregate
  def sortByCount(fieldName: String): Aggregate
  def unwind(unwindObj: IncludeArrayIndex): Aggregate
}

object Aggregate {
  @scala.inline
  def apply(
    addFields: StringDictionary[js.Any] => Aggregate,
    bucket: Boundaries => Aggregate,
    bucketAuto: Buckets => Aggregate,
    count: String => js.Any,
    end: () => Unit,
    geoNear: DistanceField => Aggregate,
    group: DictfieldName => Aggregate,
    limit: Double => js.Any,
    `match`: StringDictionary[js.Any] => Aggregate,
    project: StringDictionary[js.Any] => Aggregate,
    replaceRoot: NewRoot => Aggregate,
    sample: Size => Aggregate,
    skip: Double => js.Any,
    sort: StringDictionary[`1` | `-1`] => Aggregate,
    sortByCount: String => Aggregate,
    unwind: IncludeArrayIndex => Aggregate
  ): Aggregate = {
    val __obj = js.Dynamic.literal(addFields = js.Any.fromFunction1(addFields), bucket = js.Any.fromFunction1(bucket), bucketAuto = js.Any.fromFunction1(bucketAuto), count = js.Any.fromFunction1(count), end = js.Any.fromFunction0(end), geoNear = js.Any.fromFunction1(geoNear), group = js.Any.fromFunction1(group), limit = js.Any.fromFunction1(limit), project = js.Any.fromFunction1(project), replaceRoot = js.Any.fromFunction1(replaceRoot), sample = js.Any.fromFunction1(sample), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort), sortByCount = js.Any.fromFunction1(sortByCount), unwind = js.Any.fromFunction1(unwind))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Aggregate]
  }
}

