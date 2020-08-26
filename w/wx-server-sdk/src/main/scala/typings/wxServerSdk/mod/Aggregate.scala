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

@js.native
trait Aggregate extends js.Object {
  def addFields(fieldObj: StringDictionary[js.Any]): Aggregate = js.native
  def bucket(bucketObj: Boundaries): Aggregate = js.native
  def bucketAuto(bucketObj: Buckets): Aggregate = js.native
  def count(expr: String): js.Any = js.native
  def end(): Unit = js.native
  def geoNear(geoNearObj: DistanceField): Aggregate = js.native
  def group(groupObj: DictfieldName): Aggregate = js.native
  def limit(limitRecords: Double): js.Any = js.native
  def `match`(matchObj: StringDictionary[js.Any]): Aggregate = js.native
  def project(projectObj: StringDictionary[js.Any]): Aggregate = js.native
  def replaceRoot(replaceRootObj: NewRoot): Aggregate = js.native
  def sample(replaceRootObj: Size): Aggregate = js.native
  def skip(skipNum: Double): js.Any = js.native
  def sort(replaceRootObj: StringDictionary[`1` | `-1`]): Aggregate = js.native
  def sortByCount(fieldName: String): Aggregate = js.native
  def unwind(unwindObj: IncludeArrayIndex): Aggregate = js.native
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
  @scala.inline
  implicit class AggregateOps[Self <: Aggregate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddFields(value: StringDictionary[js.Any] => Aggregate): Self = this.set("addFields", js.Any.fromFunction1(value))
    @scala.inline
    def setBucket(value: Boundaries => Aggregate): Self = this.set("bucket", js.Any.fromFunction1(value))
    @scala.inline
    def setBucketAuto(value: Buckets => Aggregate): Self = this.set("bucketAuto", js.Any.fromFunction1(value))
    @scala.inline
    def setCount(value: String => js.Any): Self = this.set("count", js.Any.fromFunction1(value))
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setGeoNear(value: DistanceField => Aggregate): Self = this.set("geoNear", js.Any.fromFunction1(value))
    @scala.inline
    def setGroup(value: DictfieldName => Aggregate): Self = this.set("group", js.Any.fromFunction1(value))
    @scala.inline
    def setLimit(value: Double => js.Any): Self = this.set("limit", js.Any.fromFunction1(value))
    @scala.inline
    def setMatch(value: StringDictionary[js.Any] => Aggregate): Self = this.set("match", js.Any.fromFunction1(value))
    @scala.inline
    def setProject(value: StringDictionary[js.Any] => Aggregate): Self = this.set("project", js.Any.fromFunction1(value))
    @scala.inline
    def setReplaceRoot(value: NewRoot => Aggregate): Self = this.set("replaceRoot", js.Any.fromFunction1(value))
    @scala.inline
    def setSample(value: Size => Aggregate): Self = this.set("sample", js.Any.fromFunction1(value))
    @scala.inline
    def setSkip(value: Double => js.Any): Self = this.set("skip", js.Any.fromFunction1(value))
    @scala.inline
    def setSort(value: StringDictionary[`1` | `-1`] => Aggregate): Self = this.set("sort", js.Any.fromFunction1(value))
    @scala.inline
    def setSortByCount(value: String => Aggregate): Self = this.set("sortByCount", js.Any.fromFunction1(value))
    @scala.inline
    def setUnwind(value: IncludeArrayIndex => Aggregate): Self = this.set("unwind", js.Any.fromFunction1(value))
  }
  
}

